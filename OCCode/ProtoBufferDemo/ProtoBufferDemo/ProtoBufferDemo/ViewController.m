//
//  ViewController.m
//  ProtoBufferDemo
//
//  Created by Wu Kong on 16/1/18.
//  Copyright © 2016年 wukong. All rights reserved.
//

#import "ViewController.h"
#import "Person.pb.h"
#import "GCDAsyncSocket.h"

@interface ViewController () <GCDAsyncSocketDelegate>

@property (nonatomic,strong) GCDAsyncSocket *socket;
@property (nonatomic, assign) NSInteger count;
@property (nonatomic, assign) NSInteger headerRead_f;


@end


NSString *ip = @"127.0.0.1";
uint16_t port = 12345;

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    
    
    /*--------------------ProtoBuf测试--------------------------*/
    //序列化
    PBUserBuilder *ub = [[PBUserBuilder alloc] init];
    ub.userId = @"1001";
    ub.nick = @"Kana";
    ub.avatar = @"http://www.kongge.com/kana.jpg";
    
    NSData *data = [[ub build] data];
    
    //发序列化
    PBUser *user = [PBUser parseFromData:data];
    
    NSLog(@"user.nick is %@", user.nick);
    
    /*--------------------GCDAsyncSocket--------------------------*/
    _socket = [[GCDAsyncSocket alloc] initWithDelegate:self delegateQueue:dispatch_get_main_queue()];
    [_socket setAutoDisconnectOnClosedReadStream:NO];
    [_socket enableBackgroundingOnSocket];

        //连接,是否连接成功，通过delegate方法回调
    NSError *error = nil;
    BOOL result = [_socket connectToHost:@"192.168.1.35" onPort:12345 error:&error];
        
    if (!result) {
        NSLog(@"error is %@",error.localizedDescription);
    }
    
//    [_socket readDataWithTimeout:-1 tag:1002];
    [_socket readDataToLength:4 withTimeout:-1 tag:1002];
    _headerRead_f = true;


}


#pragma mark - GCDAsyncSocketDelegate

- (void)socket:(GCDAsyncSocket *)sock didConnectToHost:(NSString *)host port:(uint16_t)port {
    NSLog(@"connected to Host : %@  and Port : %i",host,port);
    
    [self doSend:nil];
}


-(void)socketDidDisconnect:(GCDAsyncSocket *)sock withError:(NSError *)err {
    NSLog(@"断开连接---> %@", err);

}

- (void)socket:(GCDAsyncSocket *)sock didWriteDataWithTag:(long)tag {
    NSLog(@"didWriteDataWithTag is %ld",tag);
}

- (void)socket:(GCDAsyncSocket *)sock didReadData:(NSData *)data withTag:(long)tag {
    
    if (_headerRead_f) {
        
        unsigned char *bytes = (unsigned char *)[data bytes];
        int maxBytes =  [self bytesToInt:bytes];
        
        NSLog(@"has got header maxByts is %i", maxBytes);
        
        [_socket readDataToLength:maxBytes withTimeout:-1 tag:1002];
        
        _headerRead_f = false;
        
        
        
    }else {
        
        PBUser *user = [PBUser parseFromData:data];
        NSLog(@"user.name is %@",user.nick);
        
        [_socket readDataToLength:4 withTimeout:-1 tag:1002];
        _headerRead_f = true;
        
    }

}


- (int)bytesToInt:(unsigned char *)bytes {
    
    int value;
    value = (int) ((bytes[0] & 0xFF)
                   | ((bytes[1] & 0xFF)<<8)
                   | ((bytes[2] & 0xFF)<<16)
                   | ((bytes[3] & 0xFF)<<24));
    return value;
}

//当服务端关闭socket会进入到这个方法
- (void)socketDidCloseReadStream:(GCDAsyncSocket *)sock {
    NSLog(@"socket has Closed");
    
}

- (NSTimeInterval)socket:(GCDAsyncSocket *)sock shouldTimeoutReadWithTag:(long)tag elapsed:(NSTimeInterval)elapsed bytesDone:(NSUInteger)length {
    NSLog(@"shouldTimeoutReadWithTag");
    
    return -1;
}


- (IBAction)doSend:(id)sender {
    
    if (self.socket) {
    
        if (_socket.isConnected) {
            _count ++;
            
            PBUserBuilder *ub = [[PBUserBuilder alloc] init];
            ub.userId = @"1001";
            ub.nick = @"Kana";
            ub.avatar = @"http://www.kongge.com/kana.jpg";
            
            NSData *data = [[ub build] data];
            [_socket writeData:data withTimeout:-1 tag:_count];

        }else {
            NSLog(@"socket 未连接");
        }
        
    }
    
}













@end
