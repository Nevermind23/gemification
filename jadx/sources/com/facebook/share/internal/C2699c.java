package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import org.json.JSONException;
import org.json.JSONObject;
import p297w4.C8769a0;

/* renamed from: com.facebook.share.internal.c */
public abstract class C2699c {
    /* renamed from: a */
    public static Bundle m10489a(ShareLinkContent shareLinkContent) {
        Bundle c = m10491c(shareLinkContent);
        C8769a0.m32661d0(c, "href", shareLinkContent.mo8537a());
        C8769a0.m32659c0(c, "quote", shareLinkContent.mo8550e());
        return c;
    }

    /* renamed from: b */
    public static Bundle m10490b(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle c = m10491c(shareOpenGraphContent);
        C8769a0.m32659c0(c, "action_type", shareOpenGraphContent.mo8597e().mo8588f());
        try {
            JSONObject e = C2697b.m10486e(C2697b.m10487f(shareOpenGraphContent), false);
            if (e != null) {
                C8769a0.m32659c0(c, "action_properties", e.toString());
            }
            return c;
        } catch (JSONException e2) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", e2);
        }
    }

    /* renamed from: c */
    public static Bundle m10491c(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag b = shareContent.mo8538b();
        if (b != null) {
            C8769a0.m32659c0(bundle, "hashtag", b.mo8539a());
        }
        return bundle;
    }
}
