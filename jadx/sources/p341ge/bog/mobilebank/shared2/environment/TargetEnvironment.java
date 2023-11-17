package p341ge.bog.mobilebank.shared2.environment;

import af1.C40303i;
import androidx.annotation.Keep;
import java.util.Map;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41545u;

@Keep
/* renamed from: ge.bog.mobilebank.shared2.environment.TargetEnvironment */
public final class TargetEnvironment {
    static final /* synthetic */ C40303i[] $$delegatedProperties;
    private final Map chatRest$delegate;
    private final Map chatSocket$delegate;
    private final Map ddEndPoint$delegate;
    private final Map dictionary$delegate;
    private final Map elasticStatementEndpoint$delegate;
    private final Map giftCardsEndpoint$delegate;
    private final Map rbMiddleware$delegate;
    private final Map sso$delegate;
    private final Map ssoChannel$delegate;
    private final Map ssoSecret$delegate;
    private final EnvironmentType type;

    static {
        Class<TargetEnvironment> cls = TargetEnvironment.class;
        $$delegatedProperties = new C40303i[]{C41520a0.m120441g(new C41545u(cls, "rbMiddleware", "getRbMiddleware()Ljava/lang/String;", 0)), C41520a0.m120441g(new C41545u(cls, "sso", "getSso()Ljava/lang/String;", 0)), C41520a0.m120441g(new C41545u(cls, "ssoSecret", "getSsoSecret()Ljava/lang/String;", 0)), C41520a0.m120441g(new C41545u(cls, "ssoChannel", "getSsoChannel()Ljava/lang/String;", 0)), C41520a0.m120441g(new C41545u(cls, "dictionary", "getDictionary()Ljava/lang/String;", 0)), C41520a0.m120441g(new C41545u(cls, "chatSocket", "getChatSocket()Ljava/lang/String;", 0)), C41520a0.m120441g(new C41545u(cls, "chatRest", "getChatRest()Ljava/lang/String;", 0)), C41520a0.m120441g(new C41545u(cls, "elasticStatementEndpoint", "getElasticStatementEndpoint()Ljava/lang/String;", 0)), C41520a0.m120441g(new C41545u(cls, "ddEndPoint", "getDdEndPoint()Ljava/lang/String;", 0)), C41520a0.m120441g(new C41545u(cls, "giftCardsEndpoint", "getGiftCardsEndpoint()Ljava/lang/String;", 0))};
    }

    public TargetEnvironment(EnvironmentType environmentType, Map<String, ? extends Object> map) {
        C41536l.m120489i(environmentType, "type");
        C41536l.m120489i(map, "properties");
        this.type = environmentType;
        this.rbMiddleware$delegate = map;
        this.sso$delegate = map;
        this.ssoSecret$delegate = map;
        this.ssoChannel$delegate = map;
        this.dictionary$delegate = map;
        this.chatSocket$delegate = map;
        this.chatRest$delegate = map;
        this.elasticStatementEndpoint$delegate = map;
        this.ddEndPoint$delegate = map;
        this.giftCardsEndpoint$delegate = map;
    }

    public final String getChatRest() {
        return (String) C41340p0.m119901a(this.chatRest$delegate, $$delegatedProperties[6].getName());
    }

    public final String getChatSocket() {
        return (String) C41340p0.m119901a(this.chatSocket$delegate, $$delegatedProperties[5].getName());
    }

    public final String getDdEndPoint() {
        return (String) C41340p0.m119901a(this.ddEndPoint$delegate, $$delegatedProperties[8].getName());
    }

    public final String getDictionary() {
        return (String) C41340p0.m119901a(this.dictionary$delegate, $$delegatedProperties[4].getName());
    }

    public final String getElasticStatementEndpoint() {
        return (String) C41340p0.m119901a(this.elasticStatementEndpoint$delegate, $$delegatedProperties[7].getName());
    }

    public final String getGiftCardsEndpoint() {
        return (String) C41340p0.m119901a(this.giftCardsEndpoint$delegate, $$delegatedProperties[9].getName());
    }

    public final String getRbMiddleware() {
        return (String) C41340p0.m119901a(this.rbMiddleware$delegate, $$delegatedProperties[0].getName());
    }

    public final String getSso() {
        return (String) C41340p0.m119901a(this.sso$delegate, $$delegatedProperties[1].getName());
    }

    public final String getSsoChannel() {
        return (String) C41340p0.m119901a(this.ssoChannel$delegate, $$delegatedProperties[3].getName());
    }

    public final String getSsoSecret() {
        return (String) C41340p0.m119901a(this.ssoSecret$delegate, $$delegatedProperties[2].getName());
    }

    public final EnvironmentType getType() {
        return this.type;
    }
}
