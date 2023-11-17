package com.salesforce.marketingcloud.sfmcsdk.components.http;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Request {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int DEFAULT_CONNECTION_TIMEOUT = 30000;
    public static final String GET = "GET";
    public static final String PATCH = "PATCH";
    public static final String POST = "POST";
    public static final String PUT = "PUT";
    public static final int RESPONSE_REQUEST_FAILED = -100;
    private final int connectionTimeout;
    private final List<String> headers;
    private final String method;
    private final String name;
    private final long rateLimit;
    private final String requestBody;
    private String tag;
    private final String url;

    public static final class Builder {
        private int connectionTimeout = Request.DEFAULT_CONNECTION_TIMEOUT;
        private List<String> headers;
        private Map<String, String> headersMap = new LinkedHashMap();
        private String method;
        private String name;
        private long rateLimit;
        private String requestBody;
        private String tag;
        private String url;

        public final Builder addOrReplaceHeader(String str, String str2) {
            C41536l.m120489i(str, "key");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            this.headersMap.put(str, C40440x.m117146P0(str2).toString());
            return this;
        }

        public final Request build() {
            List list;
            List<String> list2 = this.headers;
            if (list2 == null) {
                list = null;
            } else {
                list = C41358y.m119991B0(list2);
            }
            if (list == null) {
                list = new ArrayList();
            }
            for (Map.Entry next : this.headersMap.entrySet()) {
                list.add((String) next.getKey());
                list.add((String) next.getValue());
            }
            String str = this.method;
            if (str != null) {
                String str2 = this.url;
                if (str2 != null) {
                    int i = this.connectionTimeout;
                    String str3 = this.requestBody;
                    List z0 = C41358y.m120036z0(list);
                    if (z0 != null) {
                        String str4 = this.name;
                        if (str4 != null) {
                            return new Request(str, str3, i, str2, z0, str4, this.rateLimit, this.tag);
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final Builder connectionTimeout(int i) {
            this.connectionTimeout = i;
            return this;
        }

        public final Builder headers(List<String> list) {
            C41536l.m120489i(list, "headers");
            this.headers = list;
            return this;
        }

        public final Builder method(String str) {
            C41536l.m120489i(str, "method");
            this.method = str;
            return this;
        }

        public final Builder name(String str) {
            C41536l.m120489i(str, "name");
            this.name = str;
            return this;
        }

        public final Builder rateLimit(long j) {
            this.rateLimit = TimeUnit.SECONDS.toMillis(j);
            return this;
        }

        public final Builder requestBody(String str) {
            this.requestBody = str;
            return this;
        }

        public final Builder tag(String str) {
            this.tag = str;
            return this;
        }

        public final Builder url(String str) {
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            this.url = str;
            return this;
        }

        public final Builder url(String str, String str2) {
            C41536l.m120489i(str, "baseUrl");
            C41536l.m120489i(str2, "path");
            if (C40439w.m117114r(str, C11110u2.f31950c, false, 2, (Object) null)) {
                str = str.substring(0, str.length() - 1);
                C41536l.m120488h(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            this.url = new URL(C41536l.m120497q(str, str2)).toString();
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Method {
    }

    public Request(String str, String str2, int i, String str3, List<String> list, String str4, long j, String str5) {
        C41536l.m120489i(str, "method");
        C41536l.m120489i(str3, C11769i.C11770a.f34149l);
        C41536l.m120489i(list, "headers");
        C41536l.m120489i(str4, "name");
        this.method = str;
        this.requestBody = str2;
        this.connectionTimeout = i;
        this.url = str3;
        this.headers = list;
        this.name = str4;
        this.rateLimit = j;
        this.tag = str5;
    }

    public final int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public final List<String> getHeaders() {
        return this.headers;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getName() {
        return this.name;
    }

    public final long getRateLimit() {
        return this.rateLimit;
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final Builder toBuilder$sfmcsdk_release() {
        Builder headers2 = new Builder().method(this.method).url(this.url).connectionTimeout(this.connectionTimeout).name(this.name).headers(this.headers);
        String str = this.requestBody;
        if (str != null) {
            headers2.requestBody(str);
        }
        return headers2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Request(String str, String str2, int i, String str3, List list, String str4, long j, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, list, str4, j, (i2 & 128) != 0 ? null : str5);
    }
}
