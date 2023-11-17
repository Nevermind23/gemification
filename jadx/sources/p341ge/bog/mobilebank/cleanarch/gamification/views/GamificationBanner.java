package p341ge.bog.mobilebank.cleanarch.gamification.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import g91.C32303f;
import ih0.C25209b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p366bk.C10316e;
import p366bk.C10320i;
import p642vh.C18368l;
import p804jx.C25511a;
import p804jx.C25512b;
import p90.C27322h8;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.gamification.views.GamificationBanner */
public final class GamificationBanner extends FrameLayout {

    /* renamed from: h */
    public static final C21047b f56541h = new C21047b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C27322h8 f56542d;

    /* renamed from: e */
    private C21046a f56543e;

    /* renamed from: f */
    private C21046a f56544f;

    /* renamed from: g */
    private C25209b f56545g;

    /* renamed from: ge.bog.mobilebank.cleanarch.gamification.views.GamificationBanner$a */
    public interface C21046a {
        void invoke();
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.gamification.views.GamificationBanner$b */
    public static final class C21047b {
        private C21047b() {
        }

        public /* synthetic */ C21047b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GamificationBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m68125c(GamificationBanner gamificationBanner, Context context, View view) {
        C41536l.m120489i(gamificationBanner, "this$0");
        C41536l.m120489i(context, "$context");
        if (gamificationBanner.f56545g == C25209b.CHILD) {
            C32303f.m95184D("https://scoolapp.ge/Jn5Q ", context);
            return;
        }
        C21046a aVar = gamificationBanner.f56543e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m68126d(GamificationBanner gamificationBanner, View view) {
        C41536l.m120489i(gamificationBanner, "this$0");
        C21046a aVar = gamificationBanner.f56544f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final C21046a getOnBannerClicked() {
        return this.f56543e;
    }

    public final C21046a getOnBannerClosed() {
        return this.f56544f;
    }

    public final C25209b getType() {
        return this.f56545g;
    }

    public final void setBannerType(C25209b bVar) {
        Image image;
        C41536l.m120489i(bVar, "type");
        this.f56545g = bVar;
        AppCompatImageView appCompatImageView = this.f56542d.f68898f;
        C41536l.m120488h(appCompatImageView, "binding.gamificationImage");
        if (bVar == C25209b.CHILD) {
            image = new Image.Resource(C10320i.img_gamification_scool_banner, (Boolean) null, 2, (DefaultConstructorMarker) null);
        } else {
            image = new Image.Attribute(C10316e.img_gamification_banner, (Boolean) null, 2, (DefaultConstructorMarker) null);
        }
        C18368l.m62746A(appCompatImageView, image, (C43075l) null, 2, (Object) null);
    }

    public final void setOnBannerClicked(C21046a aVar) {
        this.f56543e = aVar;
    }

    public final void setOnBannerClosed(C21046a aVar) {
        this.f56544f = aVar;
    }

    public final void setType(C25209b bVar) {
        C41536l.m120489i(bVar, "<set-?>");
        this.f56545g = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GamificationBanner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GamificationBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C27322h8 d = C27322h8.m84595d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(\n        LayoutI…ontext), this, true\n    )");
        this.f56542d = d;
        this.f56545g = C25209b.ADULT;
        d.mo3946b().setOnClickListener(new C25511a(this, context));
        d.f68897e.setOnClickListener(new C25512b(this));
    }
}
