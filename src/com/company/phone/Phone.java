package com.company.phone;

public class Phone {
     String name;
     String mobNumber;
     boolean isVideoCall;
     boolean isVoiceCall;

    public Phone(String name, String mobNumber, boolean isVideoCall, boolean isVoiceCall) {
        this.name = name;
        this.mobNumber = mobNumber;
        this.isVideoCall = isVideoCall;
        this.isVoiceCall = isVoiceCall;
    }


    public boolean isVoiceCall() {
        return isVoiceCall;
    }

    public void setVoiceCall(boolean voiceCall) {
        isVoiceCall = voiceCall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public boolean isVideoCall() {
        return isVideoCall;
    }

    public void setVideoCall(boolean videoCall) {
        isVideoCall = videoCall;
    }
}
