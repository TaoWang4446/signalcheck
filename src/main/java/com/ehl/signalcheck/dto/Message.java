package com.ehl.signalcheck.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Message {

   /* msg :{"posid":"371702000001","occur_time":"2019-09-26 15:42:14","devs_status":[{"devid":"1000000000000000108","devfault_err":0,"network_err":0}],"msgtype":"2"}
*/
    private String posid;

    @JsonProperty("occur_time")
    private String occur_time;

    private String msgtype;

    @JsonProperty("devs_status")
    private DevsStatus devs_status;

}
