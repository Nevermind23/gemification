package p341ge.bog.designsystem.components.imagecard;

import af1.C40303i;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.C2394j;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p035c4.C2247a;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9872a4;
import p477ji.C16201a;
import p477ji.C16202b;
import p601sg.C17777b;
import p601sg.C17780e;
import p601sg.C17786k;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.imagecard.MediumTextImageCardView */
public final class MediumTextImageCardView extends LayerView {

    /* renamed from: j */
    static final /* synthetic */ C40303i[] f39562j = {C41520a0.m120439e(new C41539o(MediumTextImageCardView.class, "image", "getImage()Lge/bog/designsystem/components/common/Image;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9872a4 f39563d;

    /* renamed from: e */
    private boolean f39564e;

    /* renamed from: f */
    private boolean f39565f;

    /* renamed from: g */
    private final C41555e f39566g;

    /* renamed from: h */
    private C13341b f39567h;

    /* renamed from: i */
    private C13340a f39568i;

    /* renamed from: ge.bog.designsystem.components.imagecard.MediumTextImageCardView$a */
    public interface C13340a {
        /* renamed from: a */
        void mo33711a();
    }

    /* renamed from: ge.bog.designsystem.components.imagecard.MediumTextImageCardView$b */
    public interface C13341b {
        /* renamed from: a */
        void mo33712a();
    }

    /* renamed from: ge.bog.designsystem.components.imagecard.MediumTextImageCardView$c */
    static final class C13342c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13342c f39569d = new C13342c();

        C13342c() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2247a c0 = jVar.mo7220c0(C17780e.f49662k1);
            C41536l.m120488h(c0, "placeholder(R.drawable.thumbnail_1_1)");
            return (C2394j) c0;
        }
    }

    /* renamed from: ge.bog.designsystem.components.imagecard.MediumTextImageCardView$d */
    public static final class C13343d extends C41553c {

        /* renamed from: a */
        final /* synthetic */ MediumTextImageCardView f39570a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13343d(Object obj, MediumTextImageCardView mediumTextImageCardView) {
            super(obj);
            this.f39570a = mediumTextImageCardView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            Image image = (Image) obj2;
            if (!C41536l.m120484d((Image) obj, image)) {
                AppCompatImageView appCompatImageView = this.f39570a.f39563d.f26768k;
                C41536l.m120488h(appCompatImageView, "binding.image");
                C18368l.m62777z(appCompatImageView, image, C13342c.f39569d);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediumTextImageCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m50215c(MediumTextImageCardView mediumTextImageCardView, View view) {
        C41536l.m120489i(mediumTextImageCardView, "this$0");
        C13341b bVar = mediumTextImageCardView.f39567h;
        if (bVar != null) {
            bVar.mo33712a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m50216d(MediumTextImageCardView mediumTextImageCardView, View view) {
        C41536l.m120489i(mediumTextImageCardView, "this$0");
        C13340a aVar = mediumTextImageCardView.f39568i;
        if (aVar != null) {
            aVar.mo33711a();
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m50218g(MediumTextImageCardView mediumTextImageCardView, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        mediumTextImageCardView.mo35815f(str, str2, z);
    }

    private final TextView getDescriptionText() {
        TextView textView;
        if (this.f39564e) {
            textView = this.f39563d.f26764g;
        } else {
            textView = this.f39563d.f26763f;
        }
        C41536l.m120488h(textView, "if (descriptionOnTop) {\n…inding.descText\n        }");
        return textView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        if (r4 != false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m50219i(boolean r8, boolean r9) {
        /*
            r7 = this;
            ak.a4 r0 = r7.f39563d
            if (r8 == 0) goto L_0x000a
            int r1 = p601sg.C17780e.shape_chooser_card_active
            r7.setBackgroundResource(r1)
            goto L_0x001c
        L_0x000a:
            android.content.Context r1 = r7.getContext()
            java.lang.String r2 = "context"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            int r2 = p601sg.C17777b.f49596k
            int r1 = p642vh.C18368l.m62755d(r1, r2)
            r7.setBackgroundColor(r1)
        L_0x001c:
            ak.a4 r1 = r7.f39563d
            android.widget.LinearLayout r1 = r1.f26769l
            java.lang.String r2 = "binding.infoContainer"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            r2 = 1
            r3 = 0
            if (r8 == 0) goto L_0x003d
            android.widget.TextView r4 = r0.f26771n
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r5 = "infoHeaderText.text"
            kotlin.jvm.internal.C41536l.m120488h(r4, r5)
            boolean r4 = cf1.C40439w.m117118v(r4)
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x003d
            r4 = r2
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            r5 = 8
            if (r4 == 0) goto L_0x0044
            r4 = r3
            goto L_0x0045
        L_0x0044:
            r4 = r5
        L_0x0045:
            r1.setVisibility(r4)
            android.widget.TextView r1 = r7.getDescriptionText()
            if (r8 != 0) goto L_0x0067
            android.widget.TextView r4 = r7.getDescriptionText()
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r6 = "descriptionText.text"
            kotlin.jvm.internal.C41536l.m120488h(r4, r6)
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0063
            r4 = r2
            goto L_0x0064
        L_0x0063:
            r4 = r3
        L_0x0064:
            if (r4 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r2 = r3
        L_0x0068:
            if (r2 == 0) goto L_0x006c
            r2 = r3
            goto L_0x006d
        L_0x006c:
            r2 = r5
        L_0x006d:
            r1.setVisibility(r2)
            ge.bog.designsystem.components.buttons.Button r1 = r0.f26766i
            java.lang.String r2 = "editCardButton"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            if (r9 == 0) goto L_0x007b
            r9 = r3
            goto L_0x007c
        L_0x007b:
            r9 = r5
        L_0x007c:
            r1.setVisibility(r9)
            ge.bog.designsystem.components.buttons.Button r9 = r0.f26762e
            java.lang.String r0 = "cancelCardButton"
            kotlin.jvm.internal.C41536l.m120488h(r9, r0)
            if (r8 == 0) goto L_0x0089
            r5 = r3
        L_0x0089:
            r9.setVisibility(r5)
            r7.f39565f = r8
            r7.setMultiLine(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.imagecard.MediumTextImageCardView.m50219i(boolean, boolean):void");
    }

    /* renamed from: j */
    static /* synthetic */ void m50220j(MediumTextImageCardView mediumTextImageCardView, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        mediumTextImageCardView.m50219i(z, z2);
    }

    /* renamed from: l */
    public static /* synthetic */ void m50221l(MediumTextImageCardView mediumTextImageCardView, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        mediumTextImageCardView.mo35818k(str, str2, z, z2);
    }

    private final void setMultiLine(boolean z) {
        TextView textView = this.f39563d.f26767j;
        int i = 1;
        if (z) {
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else if (this.f39565f) {
            textView.setMaxLines(2);
            textView.setEllipsize((TextUtils.TruncateAt) null);
        } else {
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        TextView textView2 = this.f39563d.f26763f;
        if (z) {
            i = 3;
        }
        textView2.setMaxLines(i);
    }

    /* renamed from: f */
    public final void mo35815f(String str, String str2, boolean z) {
        boolean z2;
        C9872a4 a4Var = this.f39563d;
        if (str != null) {
            int i = 0;
            a4Var.f26769l.setVisibility(0);
            a4Var.f26771n.setText(str);
            TextView textView = a4Var.f26770m;
            C41536l.m120488h(textView, "infoDescText");
            if (str2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                i = 8;
            }
            textView.setVisibility(i);
            a4Var.f26770m.setText(str2);
        }
        m50219i(true, z);
    }

    public final Image getImage() {
        return (Image) this.f39566g.getValue(this, f39562j[0]);
    }

    /* renamed from: h */
    public final void mo35817h() {
        m50220j(this, false, false, 2, (Object) null);
    }

    /* renamed from: k */
    public final void mo35818k(String str, String str2, boolean z, boolean z2) {
        C41536l.m120489i(str, "header");
        this.f39563d.f26767j.setText(str);
        this.f39564e = z;
        TextView textView = this.f39563d.f26764g;
        C41536l.m120488h(textView, "binding.descTextTop");
        int i = 0;
        C18368l.m62751F(textView, this.f39564e, false, 2, (Object) null);
        TextView textView2 = this.f39563d.f26763f;
        C41536l.m120488h(textView2, "binding.descText");
        boolean z3 = true;
        C18368l.m62751F(textView2, !this.f39564e, false, 2, (Object) null);
        TextView descriptionText = getDescriptionText();
        if (str2 == null) {
            z3 = false;
        }
        if (!z3) {
            i = 8;
        }
        descriptionText.setVisibility(i);
        getDescriptionText().setText(str2);
        setMultiLine(z2);
    }

    public void setEnabled(boolean z) {
        int i;
        int i2;
        super.setEnabled(z);
        TextView textView = this.f39563d.f26767j;
        Context context = getContext();
        C41536l.m120488h(context, "context");
        if (z) {
            i = C17777b.f49601r;
        } else {
            i = C17777b.f49598o;
        }
        textView.setTextColor(C18368l.m62755d(context, i));
        TextView descriptionText = getDescriptionText();
        Context context2 = getContext();
        C41536l.m120488h(context2, "context");
        if (z) {
            i2 = C17777b.f49598o;
        } else {
            i2 = C17777b.color_invert_component_tr_100;
        }
        descriptionText.setTextColor(C18368l.m62755d(context2, i2));
    }

    public final void setImage(Image image) {
        this.f39566g.setValue(this, f39562j[0], image);
    }

    public final void setOnCancelButtonClickListener(C13340a aVar) {
        C41536l.m120489i(aVar, "listener");
        this.f39568i = aVar;
    }

    public final void setOnEditButtonClickListener(C13341b bVar) {
        C41536l.m120489i(bVar, "listener");
        this.f39567h = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediumTextImageCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediumTextImageCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9872a4 c = C9872a4.m36211c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39563d = c;
        C41551a aVar = C41551a.f97718a;
        this.f39566g = new C13343d((Object) null, this);
        setBackgroundColor(C18368l.m62755d(context, C17777b.f49596k));
        setLayerStyle(C17786k.LayerRadius12Shadow0);
        c.f26766i.setOnClickListener(new C16201a(this));
        c.f26762e.setOnClickListener(new C16202b(this));
    }
}
