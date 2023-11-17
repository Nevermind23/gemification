package p341ge.bog.designsystem.components.thumbnailbadgecard;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2394j;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41217g;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p035c4.C2247a;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.badgecontainer.BadgeContainer;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadgetext.NotificationBadgeTextView;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p352ak.C9914f6;
import p562pj.C17369a;
import p562pj.C17370b;
import p576qj.C17513a;
import p576qj.C17515b;
import p601sg.C17780e;
import p601sg.C17783h;
import p601sg.C17786k;
import p615tg.C17959a;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.thumbnailbadgecard.ThumbnailBadgeCardView */
public final class ThumbnailBadgeCardView extends LayerView {

    /* renamed from: g */
    public static final C13545b f40461g = new C13545b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C9914f6 f40462d;

    /* renamed from: e */
    private final C41217g f40463e;

    /* renamed from: f */
    private final C41217g f40464f;

    /* renamed from: ge.bog.designsystem.components.thumbnailbadgecard.ThumbnailBadgeCardView$b */
    public static final class C13545b {
        private C13545b() {
        }

        public /* synthetic */ C13545b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.thumbnailbadgecard.ThumbnailBadgeCardView$c */
    public static final class C13546c {

        /* renamed from: a */
        private final String f40468a;

        /* renamed from: b */
        private final NotificationBadgeTextView.C13406a f40469b;

        public C13546c(String str, NotificationBadgeTextView.C13406a aVar) {
            C41536l.m120489i(str, "text");
            C41536l.m120489i(aVar, "badgeProperties");
            this.f40468a = str;
            this.f40469b = aVar;
        }

        /* renamed from: a */
        public final NotificationBadgeTextView.C13406a mo36952a() {
            return this.f40469b;
        }

        /* renamed from: b */
        public final String mo36953b() {
            return this.f40468a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13546c)) {
                return false;
            }
            C13546c cVar = (C13546c) obj;
            return C41536l.m120484d(this.f40468a, cVar.f40468a) && C41536l.m120484d(this.f40469b, cVar.f40469b);
        }

        public int hashCode() {
            return (this.f40468a.hashCode() * 31) + this.f40469b.hashCode();
        }

        public String toString() {
            String str = this.f40468a;
            NotificationBadgeTextView.C13406a aVar = this.f40469b;
            return "InfoItem(text=" + str + ", badgeProperties=" + aVar + ")";
        }
    }

    /* renamed from: ge.bog.designsystem.components.thumbnailbadgecard.ThumbnailBadgeCardView$e */
    static final class C13548e extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C13548e f40477d = new C13548e();

        C13548e() {
            super(0);
        }

        /* renamed from: b */
        public final C17513a invoke() {
            return new C17513a();
        }
    }

    /* renamed from: ge.bog.designsystem.components.thumbnailbadgecard.ThumbnailBadgeCardView$f */
    static final class C13549f extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C13549f f40478d = new C13549f();

        C13549f() {
            super(0);
        }

        /* renamed from: b */
        public final C17515b invoke() {
            return new C17515b();
        }
    }

    /* renamed from: ge.bog.designsystem.components.thumbnailbadgecard.ThumbnailBadgeCardView$g */
    static final class C13550g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13550g f40479d = new C13550g();

        C13550g() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2247a c0 = ((C2394j) jVar.mo7222d()).mo7220c0(C17780e.f49668q1);
            C41536l.m120488h(c0, "circleCrop().placeholder…rawable.thumbnail_circle)");
            return (C2394j) c0;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ThumbnailBadgeCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: c */
    private final void m50780c() {
        this.f40462d.f27012n.setAdapter(getInfoAdapter());
        this.f40462d.f27010l.setOnClickListener(new C17370b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m50781d(ThumbnailBadgeCardView thumbnailBadgeCardView, View view) {
        C41536l.m120489i(thumbnailBadgeCardView, "this$0");
        thumbnailBadgeCardView.performClick();
    }

    /* renamed from: e */
    private final void m50782e() {
        this.f40462d.f27008j.setAdapter(getPriceAdapter());
        this.f40462d.f27007i.setOnClickListener(new C17369a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m50783f(ThumbnailBadgeCardView thumbnailBadgeCardView, View view) {
        C41536l.m120489i(thumbnailBadgeCardView, "this$0");
        thumbnailBadgeCardView.performClick();
    }

    /* renamed from: g */
    private final void m50784g(List list) {
        boolean z;
        RecyclerView recyclerView = this.f40462d.f27012n;
        C41536l.m120488h(recyclerView, "binding.infoRecycler");
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(recyclerView, true ^ z, false, 2, (Object) null);
        if (list != null) {
            getInfoAdapter().mo6029i(list);
        }
    }

    private final C17513a getInfoAdapter() {
        return (C17513a) this.f40463e.getValue();
    }

    private final C17515b getPriceAdapter() {
        return (C17515b) this.f40464f.getValue();
    }

    /* renamed from: h */
    private final void m50785h(List list) {
        boolean z;
        RecyclerView recyclerView = this.f40462d.f27008j;
        C41536l.m120488h(recyclerView, "binding.detailedPriceRecycler");
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(recyclerView, true ^ z, false, 2, (Object) null);
        if (list != null) {
            getPriceAdapter().mo6029i(list);
        }
    }

    public final void setValue(C13547d dVar) {
        boolean z;
        boolean z2;
        boolean z3;
        TextBadgeView textBadgeView;
        C41536l.m120489i(dVar, C11755a.C11756a.f34100b);
        ImageView imageView = this.f40462d.f27011m;
        C41536l.m120488h(imageView, "binding.iconImage");
        C18368l.m62777z(imageView, dVar.mo36961e(), C13550g.f40479d);
        this.f40462d.f27009k.setText(dVar.mo36960d());
        TextView textView = this.f40462d.f27003e;
        C41536l.m120488h(textView, "binding.amountText");
        if (dVar.mo36957a() != null) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(textView, z, false, 2, (Object) null);
        C13544a a = dVar.mo36957a();
        if (a != null) {
            TextView textView2 = this.f40462d.f27003e;
            Context context = getContext();
            C41536l.m120488h(context, "context");
            textView2.setText(a.mo36948a(context));
        }
        TextView textView3 = this.f40462d.f27005g;
        C41536l.m120488h(textView3, "binding.badgeHeaderText");
        if (dVar.mo36959c() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C18368l.m62751F(textView3, z2, false, 2, (Object) null);
        this.f40462d.f27005g.setText(dVar.mo36959c());
        BadgeContainer badgeContainer = this.f40462d.f27004f;
        C41536l.m120488h(badgeContainer, "binding.badgeContainer");
        List b = dVar.mo36958b();
        if (b == null || b.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C18368l.m62751F(badgeContainer, !z3, false, 2, (Object) null);
        List b2 = dVar.mo36958b();
        if (b2 != null) {
            this.f40462d.f27004f.removeAllViews();
            LayoutInflater from = LayoutInflater.from(getContext());
            for (Amount amount : C41358y.m120032v0(b2, 6)) {
                View inflate = from.inflate(C17783h.view_thumbnail_badge_card_amount_badge, this.f40462d.f27004f, false);
                if (inflate instanceof TextBadgeView) {
                    textBadgeView = (TextBadgeView) inflate;
                } else {
                    textBadgeView = null;
                }
                if (textBadgeView != null) {
                    textBadgeView.setBadgeText(C17959a.m61877a(amount));
                    this.f40462d.f27004f.addView(textBadgeView);
                }
            }
        }
        m50784g(dVar.mo36963f());
        m50785h(dVar.mo36964g());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbnailBadgeCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThumbnailBadgeCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9914f6 d = C9914f6.m36366d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f40462d = d;
        this.f40463e = C41219i.m119470b(C13548e.f40477d);
        this.f40464f = C41219i.m119470b(C13549f.f40478d);
        d.f27004f.setJustifyContent(0);
        setLayerStyle(C17786k.f49833r);
        setBackgroundResource(C17780e.selector_thumbnail_badge_card_bg);
        m50780c();
        m50782e();
    }

    /* renamed from: ge.bog.designsystem.components.thumbnailbadgecard.ThumbnailBadgeCardView$a */
    public static final class C13544a {

        /* renamed from: a */
        private final Amount f40465a;

        /* renamed from: b */
        private final String f40466b;

        /* renamed from: c */
        private final String f40467c;

        public C13544a(Amount amount, String str, String str2) {
            C41536l.m120489i(amount, "amount");
            C41536l.m120489i(str, "suffix");
            C41536l.m120489i(str2, "prefix");
            this.f40465a = amount;
            this.f40466b = str;
            this.f40467c = str2;
        }

        /* renamed from: a */
        public final Spanned mo36948a(Context context) {
            boolean z;
            C41536l.m120489i(context, "context");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z2 = true;
            if (this.f40467c.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                spannableStringBuilder.append(this.f40467c, new TextAppearanceSpan(context, C17786k.ThumbnailBadgeCardAmountPrefix), 33);
            }
            spannableStringBuilder.append(this.f40465a.toString());
            if (this.f40466b.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                spannableStringBuilder.append(this.f40466b, new TextAppearanceSpan(context, C17786k.ThumbnailBadgeCardAmountPrefix), 33);
            }
            return spannableStringBuilder;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13544a)) {
                return false;
            }
            C13544a aVar = (C13544a) obj;
            return C41536l.m120484d(this.f40465a, aVar.f40465a) && C41536l.m120484d(this.f40466b, aVar.f40466b) && C41536l.m120484d(this.f40467c, aVar.f40467c);
        }

        public int hashCode() {
            return (((this.f40465a.hashCode() * 31) + this.f40466b.hashCode()) * 31) + this.f40467c.hashCode();
        }

        public String toString() {
            Amount amount = this.f40465a;
            String str = this.f40466b;
            String str2 = this.f40467c;
            return "AmountWithSurrounding(amount=" + amount + ", suffix=" + str + ", prefix=" + str2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13544a(Amount amount, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(amount, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
        }
    }

    /* renamed from: ge.bog.designsystem.components.thumbnailbadgecard.ThumbnailBadgeCardView$d */
    public static final class C13547d {

        /* renamed from: a */
        private final Image f40470a;

        /* renamed from: b */
        private final String f40471b;

        /* renamed from: c */
        private final C13544a f40472c;

        /* renamed from: d */
        private final String f40473d;

        /* renamed from: e */
        private final List f40474e;

        /* renamed from: f */
        private final List f40475f;

        /* renamed from: g */
        private final List f40476g;

        public C13547d(Image image, String str, C13544a aVar, String str2, List list, List list2, List list3) {
            C41536l.m120489i(image, "icon");
            C41536l.m120489i(str, "headerText");
            this.f40470a = image;
            this.f40471b = str;
            this.f40472c = aVar;
            this.f40473d = str2;
            this.f40474e = list;
            this.f40475f = list2;
            this.f40476g = list3;
        }

        /* renamed from: a */
        public final C13544a mo36957a() {
            return this.f40472c;
        }

        /* renamed from: b */
        public final List mo36958b() {
            return this.f40474e;
        }

        /* renamed from: c */
        public final String mo36959c() {
            return this.f40473d;
        }

        /* renamed from: d */
        public final String mo36960d() {
            return this.f40471b;
        }

        /* renamed from: e */
        public final Image mo36961e() {
            return this.f40470a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13547d)) {
                return false;
            }
            C13547d dVar = (C13547d) obj;
            return C41536l.m120484d(this.f40470a, dVar.f40470a) && C41536l.m120484d(this.f40471b, dVar.f40471b) && C41536l.m120484d(this.f40472c, dVar.f40472c) && C41536l.m120484d(this.f40473d, dVar.f40473d) && C41536l.m120484d(this.f40474e, dVar.f40474e) && C41536l.m120484d(this.f40475f, dVar.f40475f) && C41536l.m120484d(this.f40476g, dVar.f40476g);
        }

        /* renamed from: f */
        public final List mo36963f() {
            return this.f40475f;
        }

        /* renamed from: g */
        public final List mo36964g() {
            return this.f40476g;
        }

        public int hashCode() {
            int hashCode = ((this.f40470a.hashCode() * 31) + this.f40471b.hashCode()) * 31;
            C13544a aVar = this.f40472c;
            int i = 0;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.f40473d;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List list = this.f40474e;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.f40475f;
            int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.f40476g;
            if (list3 != null) {
                i = list3.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            Image image = this.f40470a;
            String str = this.f40471b;
            C13544a aVar = this.f40472c;
            String str2 = this.f40473d;
            List list = this.f40474e;
            List list2 = this.f40475f;
            List list3 = this.f40476g;
            return "Value(icon=" + image + ", headerText=" + str + ", amount=" + aVar + ", badgeHeaderText=" + str2 + ", amounts=" + list + ", infoBadges=" + list2 + ", price=" + list3 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13547d(Image image, String str, C13544a aVar, String str2, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(image, str, aVar, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : list3);
        }
    }
}
