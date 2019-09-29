package com.ehl.signalcheck.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Slf4j
public class HttpStatusCodeUtil {

    public static boolean getResponseState( String ipDress) {
        //log.info("开始访问【{}】这个地址。",ipDress);
        boolean flag = false;
        String url = "http://"+ ipDress;
        int state;
        try {
            state = MyHttpClient.dogetStatus(url);
            if(state == 200){
                flag = true;
                //log.info("此ip地址={}，返回的响应状态码={}",ipDress,state);
            }else{
               // log.info("此此ip地址={},返回的响应码非200，其他。" );

                flag = false;
            }
        } catch (ClientProtocolException e) {
            flag = false;
           // log.error("访问此{}ip地址ClientProtocolException",ipDress);
        } catch (IOException e) {
            flag = false;
            //log.error("访问此{}ip地址IOException",ipDress);
        }

        return flag;
    }
}
