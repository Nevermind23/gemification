package com.salesforce.marketingcloud.sfmcsdk.components.http;

import he1.C41224m;

public abstract class Authenticator {
    public static /* synthetic */ C41224m getAuthTokenHeader$sfmcsdk_release$default(Authenticator authenticator, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            return authenticator.getAuthTokenHeader$sfmcsdk_release(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAuthTokenHeader");
    }

    public abstract void deleteCachedToken();

    public final synchronized C41224m getAuthTokenHeader$sfmcsdk_release(boolean z) {
        C41224m mVar;
        if (z) {
            mVar = refreshAuthTokenHeader();
        } else {
            mVar = getCachedTokenHeader();
            if (mVar == null) {
                mVar = refreshAuthTokenHeader();
            }
        }
        return mVar;
    }

    public abstract C41224m getCachedTokenHeader();

    public abstract C41224m refreshAuthTokenHeader();
}
