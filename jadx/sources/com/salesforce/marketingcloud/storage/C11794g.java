package com.salesforce.marketingcloud.storage;

import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.util.C11808c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.salesforce.marketingcloud.storage.g */
public interface C11794g {

    /* renamed from: a */
    public static final int f34230a = 1;

    /* renamed from: b */
    public static final int f34231b = 2;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.salesforce.marketingcloud.storage.g$a */
    public @interface C11795a {
    }

    /* renamed from: a */
    int mo31538a(InAppMessage inAppMessage, C11808c cVar);

    /* renamed from: a */
    int mo31539a(Collection<String> collection);

    /* renamed from: a */
    InAppMessage mo31540a(String str, C11808c cVar);

    /* renamed from: a */
    InAppMessage mo31541a(Collection<String> collection, C11808c cVar);

    /* renamed from: a */
    void mo31542a(InAppMessage inAppMessage);

    /* renamed from: c */
    JSONArray mo31543c(C11808c cVar);

    /* renamed from: c */
    void mo31544c(String str, int i);

    /* renamed from: d */
    List<String> mo31545d(C11808c cVar);
}
