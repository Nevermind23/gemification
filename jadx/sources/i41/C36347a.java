package i41;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: i41.a */
public abstract class C36347a {

    /* renamed from: a */
    public static final Map f87723a = Collections.unmodifiableMap(new C36348a());

    /* renamed from: b */
    public static final Map f87724b = Collections.unmodifiableMap(new C36349b());

    /* renamed from: c */
    public static final Map f87725c = Collections.unmodifiableMap(new C36350c());

    /* renamed from: d */
    public static final Map f87726d = Collections.unmodifiableMap(new C36351d());

    /* renamed from: e */
    public static final Map f87727e = Collections.unmodifiableMap(new C36352e());

    /* renamed from: f */
    public static final Map f87728f = Collections.unmodifiableMap(new C36353f());

    /* renamed from: i41.a$a */
    class C36348a extends HashMap {
        C36348a() {
            put("giftCardsEndpoint", "https://rb-api-test.bog.ge");
            put("elasticStatementEndpoint", "https://rb-api-test.bog.ge/transactional");
            put("dictionary", "https://core-api.bog.ge/configs/v1/dictionary");
            put("rbMiddleware", "https://rbm-test.bog.ge/rb-middleware-api-connector-dev");
            put("ssoChannel", "MOBILE");
            put("ssoSecret", "12345678");
            put("chatRest", "https://chat-api-dev.bog.ge");
            put("sso", "https://publisher.bog.ge/account-api-1.0/graphql");
            put("chatSocket", "wss://chat-api-dev.bog.ge/chat-api/ws");
            put("ddEndPoint", "https://rb-api-test.bog.ge/v1/transactional");
        }
    }

    /* renamed from: i41.a$b */
    class C36349b extends HashMap {
        C36349b() {
            put("giftCardsEndpoint", "https://rb-api-pre.bog.ge");
            put("elasticStatementEndpoint", "https://rb-api-pre.bog.ge/transactional");
            put("dictionary", "https://core-api-pre.bog.ge/configs/v1/dictionary");
            put("rbMiddleware", "https://rb-api-pre.bog.ge/rb-middleware-api-connector");
            put("ssoChannel", "MOBILE");
            put("ssoSecret", "82u1jksj91192!d!n2!k1mc!na?!");
            put("chatRest", "https://chat-api-dev.bog.ge");
            put("sso", "https://account-api-pre.bog.ge/account-api-1.0/graphql");
            put("chatSocket", "wss://chat-api-dev.bog.ge/chat-api/ws");
            put("ddEndPoint", "https://rb-api-pre.bog.ge/v1/transactional");
        }
    }

    /* renamed from: i41.a$c */
    class C36350c extends HashMap {
        C36350c() {
            put("giftCardsEndpoint", "https://rb-api.bog.ge");
            put("elasticStatementEndpoint", "https://rb-api.bog.ge/transactional");
            put("dictionary", "https://core-api.bog.ge/configs/v1/dictionary");
            put("rbMiddleware", "https://rb-api.bog.ge/rb-middleware-api-connector");
            put("ssoChannel", "MOBILE");
            put("ssoSecret", "82u1jksj91192!d!n2!k1mc!na?!");
            put("chatRest", "https://rb-chat-api.bog.ge");
            put("sso", "https://account-api.bog.ge/account-api-1.0/graphql");
            put("chatSocket", "wss://rb-chat-api.bog.ge/chat-api/ws");
            put("ddEndPoint", "https://rb-api.bog.ge/v1/transactional");
        }
    }

    /* renamed from: i41.a$d */
    class C36351d extends HashMap {
        C36351d() {
            put("giftCardsEndpoint", "https://rb-api-pre.bog.ge");
            put("elasticStatementEndpoint", "https://rb-api-pre.bog.ge/transactional");
            put("dictionary", "https://core-api.bog.ge/configs/v1/dictionary");
            put("rbMiddleware", "https://rbm-test.bog.ge/rb-middleware-api-connector-staging");
            put("ssoChannel", "MOBILE");
            put("ssoSecret", "82u1jksj91192!d!n2!k1mc!na?!");
            put("chatRest", "http://rb-chat-api-stg.bog.ge");
            put("sso", "https://account-api.bog.ge/account-api-1.0/graphql");
            put("chatSocket", "wss://rb-chat-api-stg.bog.ge/chat-api/ws");
            put("ddEndPoint", "http://rb-transactional-bff-gw-staging.k8s.bog.ge");
        }
    }

    /* renamed from: i41.a$e */
    class C36352e extends HashMap {
        C36352e() {
            put("giftCardsEndpoint", "https://rb-api-test.bog.ge");
            put("elasticStatementEndpoint", "https://rb-api-test.bog.ge/transactional/");
            put("dictionary", "https://core-api-test.bog.ge/configs/v1/dictionary");
            put("rbMiddleware", "https://rbm-test.bog.ge/rb-middleware-api-connector-test");
            put("ssoChannel", "MOBILE");
            put("ssoSecret", "12345678");
            put("chatRest", "https://chat-api-dev.bog.ge");
            put("sso", "https://publisher.bog.ge/account-api-1.0/graphql");
            put("chatSocket", "wss://chat-api-dev.bog.ge/chat-api/ws");
            put("ddEndPoint", "https://rb-api-test.bog.ge/v1/transactional");
        }
    }

    /* renamed from: i41.a$f */
    class C36353f extends HashMap {
        C36353f() {
            put("giftCardsEndpoint", "https://rb-api-test.bog.ge");
            put("elasticStatementEndpoint", "https://rb-api-test.bog.ge/transactional/");
            put("dictionary", "https://core-api.bog.ge/configs/v1/dictionary");
            put("rbMiddleware", "https://secureapp.bog.ge/x8-rb-middleware-api-connector");
            put("ssoChannel", "MOBILE");
            put("ssoSecret", "82u1jksj91192!d!n2!k1mc!na?!");
            put("chatRest", "https://rb-chat-api.bog.ge");
            put("sso", "https://x8-account-api.bog.ge/account-api-1.0/graphql");
            put("chatSocket", "wss://rb-chat-api.bog.ge/chat-api/ws");
            put("ddEndPoint", "https://rb-api-test.bog.ge/v1/transactional");
        }
    }
}
