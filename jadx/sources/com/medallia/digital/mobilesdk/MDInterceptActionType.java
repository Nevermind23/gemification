package com.medallia.digital.mobilesdk;

public enum MDInterceptActionType {
    accepted,
    declined,
    skipped,
    deferred;

    protected static MDInterceptActionType fromString(String str) {
        MDInterceptActionType mDInterceptActionType = accepted;
        if (mDInterceptActionType.name().equals(str)) {
            return mDInterceptActionType;
        }
        MDInterceptActionType mDInterceptActionType2 = declined;
        if (mDInterceptActionType2.name().equals(str)) {
            return mDInterceptActionType2;
        }
        MDInterceptActionType mDInterceptActionType3 = skipped;
        if (mDInterceptActionType3.name().equals(str)) {
            return mDInterceptActionType3;
        }
        MDInterceptActionType mDInterceptActionType4 = deferred;
        if (mDInterceptActionType4.name().equals(str)) {
            return mDInterceptActionType4;
        }
        return null;
    }
}
