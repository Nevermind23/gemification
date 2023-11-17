package p341ge.bog.designsystem.components.cardobjective;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.timer.TimerView;
import p352ak.C9878b2;
import p546oh.C17197a;
import p601sg.C17780e;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18368l;
import p642vh.C18375n;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.cardobjective.CardObjectiveView */
public final class CardObjectiveView extends LayerView {

    /* renamed from: j */
    static final /* synthetic */ C40303i[] f38988j;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9878b2 f38989d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C17197a f38990e;

    /* renamed from: f */
    private final C18355e0 f38991f;

    /* renamed from: g */
    private final C18355e0 f38992g;

    /* renamed from: h */
    private final C18375n f38993h;

    /* renamed from: i */
    private final C41555e f38994i;

    /* renamed from: ge.bog.designsystem.components.cardobjective.CardObjectiveView$a */
    public static final class C13214a extends C41553c {

        /* renamed from: a */
        final /* synthetic */ CardObjectiveView f38995a;

        /* renamed from: b */
        final /* synthetic */ Context f38996b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13214a(Object obj, CardObjectiveView cardObjectiveView, Context context) {
            super(obj);
            this.f38995a = cardObjectiveView;
            this.f38996b = context;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            boolean z;
            C41536l.m120489i(iVar, "property");
            CardObjectiveData cardObjectiveData = (CardObjectiveData) obj2;
            if (!C41536l.m120484d((CardObjectiveData) obj, cardObjectiveData) && cardObjectiveData != null) {
                ImageView imageView = this.f38995a.f38989d.f26800g;
                C41536l.m120488h(imageView, "data_delegate$lambda$3$lambda$2$lambda$1");
                C18368l.m62746A(imageView, cardObjectiveData.mo35069e(), (C43075l) null, 2, (Object) null);
                Integer f = cardObjectiveData.mo35071f();
                if (f != null) {
                    imageView.setImageTintList(C0767a.m2894d(this.f38996b, f.intValue()));
                }
                this.f38995a.f38989d.f26799f.setText(cardObjectiveData.mo35066b());
                this.f38995a.f38989d.f26802i.setText(cardObjectiveData.mo35073h());
                this.f38995a.f38989d.f26803j.setBudget(cardObjectiveData.mo35075i());
                this.f38995a.f38989d.f26798e.setText(cardObjectiveData.mo35065a());
                this.f38995a.f38989d.f26807n.setText(cardObjectiveData.mo35077k());
                this.f38995a.f38989d.f26798e.setTextColor(C0767a.m2893c(this.f38996b, cardObjectiveData.mo35067d()));
                this.f38995a.f38989d.f26807n.setTextColor(C0767a.m2893c(this.f38996b, cardObjectiveData.mo35067d()));
                if (cardObjectiveData.mo35076j() != null) {
                    this.f38995a.f38989d.f26806m.setTimerState(cardObjectiveData.mo35076j().mo35098a());
                    this.f38995a.f38989d.f26806m.setTimerText(cardObjectiveData.mo35076j().mo35099b());
                    TimerView timerView = this.f38995a.f38989d.f26806m;
                    C41536l.m120488h(timerView, "binding.timer");
                    C18368l.m62748C(timerView);
                } else {
                    TimerView timerView2 = this.f38995a.f38989d.f26806m;
                    C41536l.m120488h(timerView2, "binding.timer");
                    C18368l.m62766o(timerView2, false, 1, (Object) null);
                }
                List g = cardObjectiveData.mo35072g();
                if (g == null || g.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f38995a.f38990e.mo6029i(cardObjectiveData.mo35072g());
                    TextView textView = this.f38995a.f38989d.f26802i;
                    C41536l.m120488h(textView, "binding.infoTitleText");
                    C18368l.m62748C(textView);
                    RecyclerView recyclerView = this.f38995a.f38989d.f26804k;
                    C41536l.m120488h(recyclerView, "binding.recycler");
                    C18368l.m62748C(recyclerView);
                    return;
                }
                TextView textView2 = this.f38995a.f38989d.f26802i;
                C41536l.m120488h(textView2, "binding.infoTitleText");
                C18368l.m62766o(textView2, false, 1, (Object) null);
                RecyclerView recyclerView2 = this.f38995a.f38989d.f26804k;
                C41536l.m120488h(recyclerView2, "binding.recycler");
                C18368l.m62766o(recyclerView2, false, 1, (Object) null);
            }
        }
    }

    static {
        Class<CardObjectiveView> cls = CardObjectiveView.class;
        f38988j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "descriptionText", "getDescriptionText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "infoTitle", "getInfoTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "image", "getImage()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "data", "getData()Lge/bog/designsystem/components/cardobjective/CardObjectiveData;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CardObjectiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final CharSequence getDescriptionText() {
        return this.f38991f.getValue(this, f38988j[0]);
    }

    private final Image getImage() {
        return this.f38993h.getValue(this, f38988j[2]);
    }

    private final CharSequence getInfoTitle() {
        return this.f38992g.getValue(this, f38988j[1]);
    }

    private final void setDescriptionText(CharSequence charSequence) {
        this.f38991f.setValue(this, f38988j[0], charSequence);
    }

    private final void setImage(Image image) {
        this.f38993h.setValue(this, f38988j[2], image);
    }

    private final void setInfoTitle(CharSequence charSequence) {
        this.f38992g.setValue(this, f38988j[1], charSequence);
    }

    public final CardObjectiveData getData() {
        return (CardObjectiveData) this.f38994i.getValue(this, f38988j[3]);
    }

    public final void setData(CardObjectiveData cardObjectiveData) {
        this.f38994i.setValue(this, f38988j[3], cardObjectiveData);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardObjectiveView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardObjectiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9878b2 d = C9878b2.m36233d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f38989d = d;
        C17197a aVar = new C17197a();
        this.f38990e = aVar;
        TextView textView = d.f26799f;
        C41536l.m120488h(textView, "binding.descriptionText");
        this.f38991f = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView2 = d.f26802i;
        C41536l.m120488h(textView2, "binding.infoTitleText");
        this.f38992g = new C18355e0(textView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        ImageView imageView = d.f26800g;
        C41536l.m120488h(imageView, "binding.image");
        this.f38993h = new C18375n(imageView);
        C41551a aVar2 = C41551a.f97718a;
        this.f38994i = new C13214a((Object) null, this, context2);
        int[] iArr = C17787l.f50297e2;
        C41536l.m120488h(iArr, "CardObjectiveView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(C17787l.f50313f2);
        String str = "";
        setDescriptionText(string == null ? str : string);
        String string2 = obtainStyledAttributes.getString(C17787l.f50345h2);
        setInfoTitle(string2 != null ? string2 : str);
        setImage(new Image.Resource(obtainStyledAttributes.getResourceId(C17787l.f50329g2, C17780e.f49662k1), (Boolean) null, 2, (DefaultConstructorMarker) null));
        obtainStyledAttributes.recycle();
        d.f26804k.setAdapter(aVar);
    }
}
