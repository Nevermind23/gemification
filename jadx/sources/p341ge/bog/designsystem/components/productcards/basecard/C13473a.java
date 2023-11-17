package p341ge.bog.designsystem.components.productcards.basecard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41238w;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p365bj.C10299a;
import p601sg.C17777b;
import p601sg.C17780e;
import p601sg.C17786k;
import p615tg.C17959a;
import p642vh.C18358g;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.productcards.basecard.a */
public abstract class C13473a extends LayerView {

    /* renamed from: f */
    public static final C13478c f40167f = new C13478c((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C13476b f40168d = C13476b.CLEAR;

    /* renamed from: e */
    private final SimpleDateFormat f40169e = new SimpleDateFormat("dd.MM.yyyy", C18368l.m62759h(this));

    /* renamed from: ge.bog.designsystem.components.productcards.basecard.a$a */
    public enum C13474a {
        WIDE(0),
        SQUARE(1),
        WIDE_NEW(2);
        

        /* renamed from: e */
        public static final C13475a f40170e = null;

        /* renamed from: d */
        private final int f40175d;

        /* renamed from: ge.bog.designsystem.components.productcards.basecard.a$a$a */
        public static final class C13475a {
            private C13475a() {
            }

            public /* synthetic */ C13475a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13474a mo36571a(int i) {
                boolean z;
                for (C13474a aVar : C13474a.values()) {
                    if (aVar.mo36570b() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return aVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        static {
            f40170e = new C13475a((DefaultConstructorMarker) null);
        }

        private C13474a(int i) {
            this.f40175d = i;
        }

        /* renamed from: b */
        public final int mo36570b() {
            return this.f40175d;
        }
    }

    /* renamed from: ge.bog.designsystem.components.productcards.basecard.a$b */
    public enum C13476b {
        WHITE(0, C17780e.selector_product_card_white, C17786k.TextBody2White200Left, C18358g.m62727a(C17777b.color_white_tr_200), C17786k.TextH2White500Left, C18358g.m62727a(C17777b.f49590A), 8),
        BLACK(1, r15, r6, r17, r8, C18358g.m62727a(r2), 8),
        COLOR(2, C17780e.selector_product_card_color, r6, C18358g.m62727a(r1), r8, C18358g.m62727a(r2), 0),
        CLEAR(3, C17780e.selector_product_card_clear, C17786k.TextBody2InvertComponents200Left, C18358g.m62727a(C17777b.f49599p), C17786k.TextH2InvertComponents400Left, C18358g.m62727a(C17777b.f49601r), 0);
        

        /* renamed from: k */
        public static final C13477a f40176k = null;

        /* renamed from: d */
        private final int f40182d;

        /* renamed from: e */
        private final int f40183e;

        /* renamed from: f */
        private final int f40184f;

        /* renamed from: g */
        private final Color f40185g;

        /* renamed from: h */
        private final int f40186h;

        /* renamed from: i */
        private final Color f40187i;

        /* renamed from: j */
        private final int f40188j;

        /* renamed from: ge.bog.designsystem.components.productcards.basecard.a$b$a */
        public static final class C13477a {
            private C13477a() {
            }

            public /* synthetic */ C13477a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13476b mo36579a(int i) {
                boolean z;
                for (C13476b bVar : C13476b.values()) {
                    if (bVar.mo36576g() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return bVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        static {
            f40176k = new C13477a((DefaultConstructorMarker) null);
        }

        private C13476b(int i, int i2, int i3, Color color, int i4, Color color2, int i5) {
            this.f40182d = i;
            this.f40183e = i2;
            this.f40184f = i3;
            this.f40185g = color;
            this.f40186h = i4;
            this.f40187i = color2;
            this.f40188j = i5;
        }

        /* renamed from: b */
        public final Color mo36572b() {
            return this.f40187i;
        }

        /* renamed from: c */
        public final int mo36573c() {
            return this.f40186h;
        }

        /* renamed from: e */
        public final int mo36574e() {
            return this.f40188j;
        }

        /* renamed from: f */
        public final int mo36575f() {
            return this.f40183e;
        }

        /* renamed from: g */
        public final int mo36576g() {
            return this.f40182d;
        }

        /* renamed from: h */
        public final Color mo36577h() {
            return this.f40185g;
        }

        /* renamed from: l */
        public final int mo36578l() {
            return this.f40184f;
        }
    }

    /* renamed from: ge.bog.designsystem.components.productcards.basecard.a$c */
    public static final class C13478c {
        private C13478c() {
        }

        public /* synthetic */ C13478c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.productcards.basecard.a$d */
    public interface C13479d {
        /* renamed from: a */
        boolean mo36468a();

        /* renamed from: b */
        List mo36469b();

        /* renamed from: c */
        List mo36470c();

        /* renamed from: d */
        C13476b mo36471d();

        /* renamed from: e */
        Image mo36472e();

        /* renamed from: f */
        boolean mo36474f();

        Amount getAmount();

        Image getIcon();

        String getTitle();
    }

    /* renamed from: ge.bog.designsystem.components.productcards.basecard.a$e */
    static final class C13480e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13473a f40189d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13480e(C13473a aVar) {
            super(1);
            this.f40189d = aVar;
        }

        /* renamed from: a */
        public final void mo36580a(C13476b bVar) {
            C41536l.m120489i(bVar, "newTheme");
            this.f40189d.setCardTheme(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo36580a((C13476b) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13473a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36461a() {
    }

    /* access modifiers changed from: protected */
    public abstract C10299a getCardShape();

    /* access modifiers changed from: protected */
    public final C13476b getCardTheme() {
        return this.f40168d;
    }

    /* access modifiers changed from: protected */
    public final SimpleDateFormat getDateFormat() {
        return this.f40169e;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (getCardShape().mo26906d() != -1) {
            i2 = View.MeasureSpec.makeMeasureSpec(getCardShape().mo26906d(), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public final void setBadgeVisible(boolean z) {
        getCardShape().mo26911i(z);
    }

    /* access modifiers changed from: protected */
    public abstract void setCardShape(C10299a aVar);

    /* access modifiers changed from: protected */
    public final void setCardTheme(C13476b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        getCardShape().mo26914m(bVar);
        this.f40168d = bVar;
        mo36461a();
    }

    public void setData(C13479d dVar) {
        C13480e eVar;
        C41536l.m120489i(dVar, "data");
        getCardShape().mo26919r(dVar.getTitle());
        setBadgeVisible(dVar.mo36468a());
        getCardShape().mo26909g(C17959a.m61877a(dVar.getAmount()));
        C10299a cardShape = getCardShape();
        Image e = dVar.mo36472e();
        if (dVar.mo36474f()) {
            eVar = new C13480e(this);
        } else {
            eVar = null;
        }
        cardShape.mo26913k(e, eVar);
        setCardTheme(dVar.mo36471d());
        getCardShape().mo26916o(dVar.getIcon());
        List b = dVar.mo36469b();
        if (b != null) {
            getCardShape().mo26915n(b);
        }
        List c = dVar.mo36470c();
        if (c != null) {
            getCardShape().mo26917p(c);
        }
    }
}
