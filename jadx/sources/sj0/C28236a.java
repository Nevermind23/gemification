package sj0;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj0.C26041d;
import mj0.C26238b;
import p341ge.bog.designsystem.components.common.Image;
import rj0.C28046a;
import th0.C28433w0;

/* renamed from: sj0.a */
public final class C28236a extends C26238b {

    /* renamed from: f */
    public static final C28237a f71598f = new C28237a((DefaultConstructorMarker) null);

    /* renamed from: sj0.a$a */
    public static final class C28237a {
        private C28237a() {
        }

        public /* synthetic */ C28237a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28236a(C28433w0 w0Var) {
        super(w0Var);
        C41536l.m120489i(w0Var, "binding");
    }

    /* renamed from: m */
    public void mo48397j(C28046a aVar) {
        C41536l.m120489i(aVar, "item");
        super.mo48397j(aVar);
        AppCompatImageView appCompatImageView = ((C28433w0) mo65241h()).f72227e;
        C41536l.m120488h(appCompatImageView, "giftCardDescriptionImage");
        C26041d.m81680a(appCompatImageView, new Image.Url(aVar.mo67587a(), (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null), 16);
    }
}
