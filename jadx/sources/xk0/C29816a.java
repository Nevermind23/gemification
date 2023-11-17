package xk0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ok0.C27028d;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: xk0.a */
public enum C29816a {
    OWN_ACCOUNT(new Image.Resource(C27028d.icons_16_payment_transfer_transfer_own_outline, (Boolean) null, 2, (DefaultConstructorMarker) null), C34646b.m101748b("text.hub.item.transfer.to.own.account", new Object[0]), (Image) null, (StringSource) null, 12, (Color) null),
    CURRENCY_EXCHANGE(new Image.Resource(C27028d.icons_16_general_exchange_rates, (Boolean) null, 2, (DefaultConstructorMarker) null), C34646b.m101748b("text.hub.item.currency.exchange", new Object[0]), (Image) null, (StringSource) null, 12, (Color) null),
    SOMEONE_ELSE(new Image.Resource(C27028d.icons_16_payment_transfer_transfer_other_outline, (Boolean) null, 2, (DefaultConstructorMarker) null), C34646b.m101748b("text.hub.item.transfer.to.someone", new Object[0]), (Image) null, (StringSource) null, 12, (Color) null),
    TREASURE(new Image.Resource(C27028d.icons_16_payment_transfer_transfer_treasury_outline, (Boolean) null, 2, (DefaultConstructorMarker) null), C34646b.m101748b("text.hub.item.transfer.to.treasury", new Object[0]), (Image) null, (StringSource) null, 12, (Color) null);
    

    /* renamed from: d */
    private final Image f75496d;

    /* renamed from: e */
    private final StringSource f75497e;

    /* renamed from: f */
    private final Color f75498f;

    /* renamed from: g */
    private final Color f75499g;

    private C29816a(Image image, StringSource stringSource, Color color, Color color2) {
        this.f75496d = image;
        this.f75497e = stringSource;
        this.f75498f = color;
        this.f75499g = color2;
    }

    /* renamed from: b */
    public final Color mo70070b() {
        return this.f75499g;
    }

    /* renamed from: c */
    public final Image mo70071c() {
        return this.f75496d;
    }

    /* renamed from: e */
    public final Color mo70072e() {
        return this.f75498f;
    }

    /* renamed from: f */
    public final StringSource mo70073f() {
        return this.f75497e;
    }
}
