package p341ge.bog.designsystem.components.cardheader;

import af1.C40303i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.C2394j;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p035c4.C2247a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p352ak.C10059z1;
import p518mh.C16684a;
import p518mh.C16685b;
import p519mi.C16686a;
import p601sg.C17777b;
import p601sg.C17780e;
import p601sg.C17786k;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.cardheader.CardHeaderView */
public final class CardHeaderView extends LayerView {

    /* renamed from: p */
    static final /* synthetic */ C40303i[] f38948p;

    /* renamed from: d */
    private final C10059z1 f38949d;

    /* renamed from: e */
    private View.OnClickListener f38950e;

    /* renamed from: f */
    private Image f38951f;

    /* renamed from: g */
    private final C18355e0 f38952g;

    /* renamed from: h */
    private final C18355e0 f38953h;

    /* renamed from: i */
    private final C18365j0 f38954i;

    /* renamed from: j */
    private final C18365j0 f38955j;

    /* renamed from: k */
    private C16684a f38956k;

    /* renamed from: l */
    private CharSequence f38957l;

    /* renamed from: m */
    private String f38958m;

    /* renamed from: n */
    private C16686a f38959n;

    /* renamed from: o */
    private boolean f38960o;

    /* renamed from: ge.bog.designsystem.components.cardheader.CardHeaderView$a */
    public /* synthetic */ class C13205a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38961a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                mh.a[] r0 = p518mh.C16684a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                mh.a r1 = p518mh.C16684a.INFO     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                mh.a r1 = p518mh.C16684a.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                mh.a r1 = p518mh.C16684a.GONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f38961a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.cardheader.CardHeaderView.C13205a.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.designsystem.components.cardheader.CardHeaderView$b */
    static final class C13206b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13206b f38962d = new C13206b();

        C13206b() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2247a c0 = jVar.mo7220c0(C17780e.f49661j1);
            C41536l.m120488h(c0, "placeholder(R.drawable.thumbnail_16_9)");
            return (C2394j) c0;
        }
    }

    static {
        Class<CardHeaderView> cls = CardHeaderView.class;
        f38948p = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "cardTitle", "getCardTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "cardAccountNumber", "getCardAccountNumber()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "showCardImageBadge", "getShowCardImageBadge()Z", 0)), C41520a0.m120439e(new C41539o(cls, "showFavoriteIcon", "getShowFavoriteIcon()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CardHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m49645b(CardHeaderView cardHeaderView, View view) {
        C41536l.m120489i(cardHeaderView, "this$0");
        View.OnClickListener onClickListener = cardHeaderView.f38950e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public final CharSequence getCardAccountNumber() {
        return this.f38953h.getValue(this, f38948p[1]);
    }

    public final Image getCardImage() {
        return this.f38951f;
    }

    public final CharSequence getCardImageBadgeTitle() {
        return this.f38949d.f27803j.getBadgeText();
    }

    public final Button getCardInfoButton() {
        Button button = this.f38949d.f27802i;
        C41536l.m120488h(button, "binding.cardInfoButton");
        return button;
    }

    public final C16686a getCardNotificationState() {
        return this.f38959n;
    }

    public final String getCardNotificationTitle() {
        return this.f38958m;
    }

    public final CharSequence getCardTitle() {
        return this.f38952g.getValue(this, f38948p[0]);
    }

    public final boolean getShowCardImageBadge() {
        return this.f38954i.getValue(this, f38948p[2]).booleanValue();
    }

    public final boolean getShowCardNotification() {
        return this.f38960o;
    }

    public final boolean getShowFavoriteIcon() {
        return this.f38955j.getValue(this, f38948p[3]).booleanValue();
    }

    public final C16684a getSubtitleState() {
        return this.f38956k;
    }

    public final CharSequence getSubtitleText() {
        return this.f38957l;
    }

    public final void setCardAccountNumber(CharSequence charSequence) {
        this.f38953h.setValue(this, f38948p[1], charSequence);
    }

    public final void setCardImage(Image image) {
        this.f38951f = image;
        if (image != null) {
            AppCompatImageView appCompatImageView = this.f38949d.f27799f;
            C41536l.m120488h(appCompatImageView, "binding.cardHeaderImage");
            C18368l.m62777z(appCompatImageView, image, C13206b.f38962d);
        }
    }

    public final void setCardImageBadgeTitle(CharSequence charSequence) {
        this.f38949d.f27803j.setBadgeText(charSequence);
    }

    public final void setCardNotificationState(C16686a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f38959n = aVar;
        this.f38949d.f27805l.setInlineFeedbackState(aVar);
    }

    public final void setCardNotificationTitle(String str) {
        this.f38958m = str;
        this.f38949d.f27805l.setTitleText(str);
    }

    public final void setCardTitle(CharSequence charSequence) {
        this.f38952g.setValue(this, f38948p[0], charSequence);
    }

    public final void setShowCardImageBadge(boolean z) {
        this.f38954i.mo46151c(this, f38948p[2], z);
    }

    public final void setShowCardNotification(boolean z) {
        this.f38960o = z;
        InlineFeedback inlineFeedback = this.f38949d.f27805l;
        C41536l.m120488h(inlineFeedback, "binding.inlineNotification");
        C18368l.m62751F(inlineFeedback, z, false, 2, (Object) null);
    }

    public final void setShowFavoriteIcon(boolean z) {
        this.f38955j.mo46151c(this, f38948p[3], z);
    }

    public final void setSubtitleState(C16684a aVar) {
        int i;
        boolean z;
        this.f38956k = aVar;
        if (aVar == null) {
            i = -1;
        } else {
            i = C13205a.f38961a[aVar.ordinal()];
        }
        if (i != -1) {
            boolean z2 = true;
            if (i == 1 || i == 2) {
                FrameLayout frameLayout = this.f38949d.f27806m;
                C41536l.m120488h(frameLayout, "binding.subtitleLayout");
                C18368l.m62751F(frameLayout, true, false, 2, (Object) null);
                TextView textView = this.f38949d.f27809p;
                C41536l.m120488h(textView, "binding.subtitleText");
                if (this.f38956k == C16684a.INFO) {
                    z = true;
                } else {
                    z = false;
                }
                C18368l.m62751F(textView, z, false, 2, (Object) null);
                LayerView layerView = this.f38949d.f27807n;
                C41536l.m120488h(layerView, "binding.subtitleNegativeLayer");
                if (this.f38956k != C16684a.NEGATIVE) {
                    z2 = false;
                }
                C18368l.m62751F(layerView, z2, false, 2, (Object) null);
                return;
            } else if (i != 3) {
                return;
            }
        }
        FrameLayout frameLayout2 = this.f38949d.f27806m;
        C41536l.m120488h(frameLayout2, "binding.subtitleLayout");
        C18368l.m62751F(frameLayout2, false, false, 2, (Object) null);
    }

    public final void setSubtitleText(CharSequence charSequence) {
        this.f38957l = charSequence;
        C16684a aVar = this.f38956k;
        if (aVar == C16684a.INFO) {
            this.f38949d.f27809p.setText(charSequence);
        } else if (aVar == C16684a.NEGATIVE) {
            this.f38949d.f27808o.setText(charSequence);
        }
    }

    public final void setonCardInfoClickListener(View.OnClickListener onClickListener) {
        this.f38950e = onClickListener;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C10059z1 c = C10059z1.m36898c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f38949d = c;
        TextView textView = c.f27801h;
        C41536l.m120488h(textView, "binding.cardHeaderTitle");
        this.f38952g = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView2 = c.f27798e;
        C41536l.m120488h(textView2, "binding.cardHeaderAccountNumber");
        this.f38953h = new C18355e0(textView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextBadgeView textBadgeView = c.f27803j;
        C41536l.m120488h(textBadgeView, "binding.digitalTextBadge");
        this.f38954i = new C18365j0(textBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView = c.f27804k;
        C41536l.m120488h(appCompatImageView, "binding.favoriteImage");
        this.f38955j = new C18365j0(appCompatImageView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        this.f38959n = C16686a.INFO;
        setLayerStyle(C17786k.f49834t);
        setBackgroundColor(C18368l.m62755d(context, C17777b.f49596k));
        c.f27802i.setOnClickListener(new C16685b(this));
    }
}
