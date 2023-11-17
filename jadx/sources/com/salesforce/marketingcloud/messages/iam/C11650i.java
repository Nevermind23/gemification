package com.salesforce.marketingcloud.messages.iam;

import android.graphics.Typeface;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.media.C11580o;

/* renamed from: com.salesforce.marketingcloud.messages.iam.i */
interface C11650i {
    boolean canDisplay(InAppMessage inAppMessage);

    int getStatusBarColor();

    Typeface getTypeface();

    void handleMessageFinished(InAppMessage inAppMessage, C11651j jVar);

    C11580o imageHandler();

    UrlHandler urlHandler();
}
