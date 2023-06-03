package com.moko.support.task;


import com.moko.ble.lib.task.OrderTask;
import com.moko.support.entity.OrderCHAR;

public class GetDeviceMacTask extends OrderTask {

    public byte[] data;

    public GetDeviceMacTask() {
        super(OrderCHAR.CHAR_DEVICE_MAC, RESPONSE_TYPE_READ);
    }

    @Override
    public byte[] assemble() {
        return data;
    }
}
