/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.raspberrypicodebased.plugin.constants;

import org.wso2.carbon.utils.CarbonUtils;

import java.io.File;

/**
 * Device type specific constants which includes all transport protocols configurations,
 * stream definition and device specific dome constants
 */
public class DeviceTypeConstants {
    public static final String DEVICE_TYPE = "raspberrypicodebased";
    public static final String DEVICE_PLUGIN_DEVICE_NAME = "DEVICE_NAME";
    public static final String DEVICE_PLUGIN_DEVICE_ID = "raspberrypicodebased_DEVICE_ID";
    public static final String STATE_ON = "ON";
    public static final String STATE_OFF = "OFF";
    public static final String BULB_CONTEXT = "BULB";

    //sensor events summerized table name
    public static final String SENSOR_TYPE1_EVENT_TABLE = "ORG_WSO2_IOT_DEVICES_sensor_temp";
    public static final String SENSOR_TYPE2_EVENT_TABLE = "ORG_WSO2_IOT_DEVICES_no_sensor1";
    public static final String DATA_SOURCE_NAME = "jdbc/raspberrypicodebasedDM_DB";
    public static final String DEVICE_TYPE_PROVIDER_DOMAIN = "carbon.super";
    public static final String SENSOR_TYPE1 = "sensor_temp";
    public static final String SENSOR_TYPE2 = "no_sensor1";

    //mqtt tranport related constants
    public static final String MQTT_ADAPTER_NAME = "sensor_temp_mqtt";
    public static final String MQTT_ADAPTER_TYPE = "oauth-mqtt";
    public static final String ADAPTER_TOPIC_PROPERTY = "topic";
    public static final String MQTT_PORT = "\\{mqtt.broker.port\\}";
    public static final String MQTT_BROKER_HOST = "\\{mqtt.broker.host\\}";
    public static final String CARBON_CONFIG_PORT_OFFSET = "Ports.Offset";
    public static final String DEFAULT_CARBON_LOCAL_IP_PROPERTY = "carbon.local.ip";
    public static final int CARBON_DEFAULT_PORT_OFFSET = 0;
    public static final int DEFAULT_MQTT_PORT = 1883;
    public static final String SUBSCRIBED_TOPIC = "carbon.super/raspberrypicodebased/+/sensor_temp";
    public static final String CONTENT_TRANSFORMATION = "contentTransformer";
    public static final String CONTENT_VALIDATION = "contentValidator";
    public static final String RESOURCE = "resource";

    public static final String USERNAME_PROPERTY_KEY = "username";
    public static final String DCR_PROPERTY_KEY = "dcrUrl";
    public static final String BROKER_URL_PROPERTY_KEY = "url";
    public static final String SCOPES_PROPERTY_KEY = "scopes";
    public static final String QOS_PROPERTY_KEY = "qos";
    public static final String CLIENT_ID_PROPERTY_KEY = "qos";
    public static final String CLEAR_SESSION_PROPERTY_KEY = "clearSession";
    public static final String TOPIC = "topic";

    public static final String SENSOR_TYPE1_STREAM_DEFINITION = "org.wso2.iot.devices.sensor_temp";
    public static final String SENSOR_TYPE1_STREAM_DEFINITION_VERSION = "1.0.0";


    public static final String MQTT_CONFIG_LOCATION = CarbonUtils.getEtcCarbonConfigDirPath() + File.separator
            + "mqtt.properties";
}

