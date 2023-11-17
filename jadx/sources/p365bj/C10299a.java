package p365bj;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.C1314o;
import com.bumptech.glide.C2394j;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.cardbadgesupdate.CardBadgeView;
import p341ge.bog.designsystem.components.common.CropImageView;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.creditcard.badge.CreditCardsBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.multipledots.HideableAmountView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.productcards.basecard.C13473a;
import p352ak.C10006r4;
import p352ak.C10013s4;
import p352ak.C10020t4;
import p504lh.C16575a;
import p601sg.C17777b;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18389z;
import p669xh.C18763a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: bj.a */
public abstract class C10299a {

    /* renamed from: a */
    private final C6201a f28557a;

    /* renamed from: b */
    private int f28558b;

    /* renamed from: bj.a$a */
    public static class C10300a extends C10299a {

        /* renamed from: g */
        static final /* synthetic */ C40303i[] f28559g;

        /* renamed from: c */
        private final C18355e0 f28560c;

        /* renamed from: d */
        private final C18355e0 f28561d;

        /* renamed from: e */
        private final C18389z f28562e;

        /* renamed from: f */
        private final C18365j0 f28563f;

        /* renamed from: bj.a$a$a */
        static final class C10301a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C43075l f28564d;

            /* renamed from: e */
            final /* synthetic */ C10300a f28565e;

            /* renamed from: f */
            final /* synthetic */ Image f28566f;

            /* renamed from: bj.a$a$a$a */
            static final class C10302a extends C41537m implements C43064a {

                /* renamed from: d */
                final /* synthetic */ C43075l f28567d;

                /* renamed from: e */
                final /* synthetic */ C10300a f28568e;

                /* renamed from: f */
                final /* synthetic */ Image f28569f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C10302a(C43075l lVar, C10300a aVar, Image image) {
                    super(0);
                    this.f28567d = lVar;
                    this.f28568e = aVar;
                    this.f28569f = image;
                }

                /* renamed from: b */
                public final Boolean invoke() {
                    C43075l lVar = this.f28567d;
                    if (lVar != null) {
                        lVar.invoke(this.f28568e.mo26910h(this.f28569f));
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10301a(C43075l lVar, C10300a aVar, Image image) {
                super(1);
                this.f28564d = lVar;
                this.f28565e = aVar;
                this.f28566f = image;
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                return C18368l.m62771t(jVar, new C10302a(this.f28564d, this.f28565e, this.f28566f));
            }
        }

        static {
            Class<C10300a> cls = C10300a.class;
            f28559g = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "amountText", "getAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "showAmount", "getShowAmount()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isBadgeVisible", "isBadgeVisible()Z", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10300a(C10006r4 r4Var) {
            super(r4Var, C17779d.card_shape_wide_height, (DefaultConstructorMarker) null);
            C41536l.m120489i(r4Var, "binding");
            TextView textView = r4Var.f27482p;
            C41536l.m120488h(textView, "binding.title");
            this.f28560c = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView = r4Var.f27471e;
            C41536l.m120488h(appCompatTextView, "binding.amount");
            this.f28561d = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            HideableAmountView hideableAmountView = r4Var.f27472f;
            C41536l.m120488h(hideableAmountView, "binding.amountContainer");
            this.f28562e = new C18389z(hideableAmountView);
            NotificationBadgeView notificationBadgeView = r4Var.f27473g;
            C41536l.m120488h(notificationBadgeView, "binding.badge");
            this.f28563f = new C18365j0(notificationBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            C1314o.m4567i(r4Var.f27471e, 1);
            r4Var.f27476j.setVisibility(8);
            m37561t(C17780e.selector_product_card_black, C17786k.TextBody2Black200Left, C17786k.TextH2Black400Left);
        }

        /* renamed from: s */
        private final void m37560s(List list) {
            ((C10006r4) mo26904b()).f27477k.removeAllViews();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CardBadgeView cardBadgeView = new CardBadgeView(mo26905c(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                cardBadgeView.setCard((C16575a) it.next());
                cardBadgeView.setPadding(C18368l.m62762k(8), 0, 0, 0);
                ((C10006r4) mo26904b()).f27477k.addView(cardBadgeView);
            }
        }

        /* renamed from: t */
        private final void m37561t(int i, int i2, int i3) {
            Integer num;
            ((C10006r4) mo26904b()).f27480n.setBackgroundResource(i);
            C1314o.m4575q(((C10006r4) mo26904b()).f27482p, i2);
            C1314o.m4575q(((C10006r4) mo26904b()).f27471e, i3);
            HideableAmountView hideableAmountView = ((C10006r4) mo26904b()).f27472f;
            AppCompatTextView appCompatTextView = ((C10006r4) mo26904b()).f27471e;
            C41536l.m120488h(appCompatTextView, "binding.amount");
            ColorStateList textColors = appCompatTextView.getTextColors();
            if (textColors != null) {
                num = Integer.valueOf(textColors.getDefaultColor());
            } else {
                num = null;
            }
            hideableAmountView.setDotsTintColor(num);
        }

        /* renamed from: f */
        public boolean mo26908f() {
            return this.f28562e.getValue(this, f28559g[2]).booleanValue();
        }

        /* renamed from: g */
        public void mo26909g(CharSequence charSequence) {
            this.f28561d.setValue(this, f28559g[1], charSequence);
        }

        /* renamed from: i */
        public void mo26911i(boolean z) {
            this.f28563f.mo46151c(this, f28559g[3], z);
        }

        /* renamed from: j */
        public void mo26912j(View view) {
            C41238w wVar;
            if (view != null) {
                ((C10006r4) mo26904b()).f27474h.setVisibility(0);
                ((C10006r4) mo26904b()).f27474h.removeAllViews();
                ((C10006r4) mo26904b()).f27474h.addView(view);
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                ((C10006r4) mo26904b()).f27474h.setVisibility(8);
            }
        }

        /* renamed from: k */
        public void mo26913k(Image image, C43075l lVar) {
            CropImageView cropImageView = ((C10006r4) mo26904b()).f27475i;
            C41536l.m120488h(cropImageView, "setCardBackground$lambda$0");
            C18368l.m62777z(cropImageView, image, new C10301a(lVar, this, image));
            cropImageView.mo35304f();
        }

        /* renamed from: m */
        public void mo26914m(C13473a.C13476b bVar) {
            C41536l.m120489i(bVar, "theme");
        }

        /* renamed from: n */
        public void mo26915n(List list) {
            C41536l.m120489i(list, "creditCards");
            throw new IllegalStateException("Unsupported cards");
        }

        /* renamed from: o */
        public void mo26916o(Image image) {
        }

        /* renamed from: p */
        public void mo26917p(List list) {
            C41536l.m120489i(list, "creditCards");
            LinearLayoutCompat linearLayoutCompat = ((C10006r4) mo26904b()).f27477k;
            C41536l.m120488h(linearLayoutCompat, "binding.creditCards");
            C18368l.m62751F(linearLayoutCompat, !list.isEmpty(), false, 2, (Object) null);
            m37560s(list);
        }

        /* renamed from: q */
        public void mo26918q(boolean z) {
            this.f28562e.mo46189b(this, f28559g[2], z);
        }

        /* renamed from: r */
        public void mo26919r(CharSequence charSequence) {
            this.f28560c.setValue(this, f28559g[0], charSequence);
        }
    }

    /* renamed from: bj.a$b */
    public static class C10303b extends C10299a {

        /* renamed from: g */
        static final /* synthetic */ C40303i[] f28570g;

        /* renamed from: c */
        private final C18355e0 f28571c;

        /* renamed from: d */
        private final C18355e0 f28572d;

        /* renamed from: e */
        private final C18389z f28573e;

        /* renamed from: f */
        private final C18365j0 f28574f;

        /* renamed from: bj.a$b$a */
        public /* synthetic */ class C10304a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f28575a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    ge.bog.designsystem.components.productcards.basecard.a$b[] r0 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    ge.bog.designsystem.components.productcards.basecard.a$b r1 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.WHITE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    ge.bog.designsystem.components.productcards.basecard.a$b r1 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.BLACK     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    ge.bog.designsystem.components.productcards.basecard.a$b r1 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.COLOR     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    ge.bog.designsystem.components.productcards.basecard.a$b r1 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.CLEAR     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f28575a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p365bj.C10299a.C10303b.C10304a.<clinit>():void");
            }
        }

        /* renamed from: bj.a$b$b */
        static final class C10305b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C43075l f28576d;

            /* renamed from: e */
            final /* synthetic */ C10303b f28577e;

            /* renamed from: f */
            final /* synthetic */ Image f28578f;

            /* renamed from: bj.a$b$b$a */
            static final class C10306a extends C41537m implements C43064a {

                /* renamed from: d */
                final /* synthetic */ C43075l f28579d;

                /* renamed from: e */
                final /* synthetic */ C10303b f28580e;

                /* renamed from: f */
                final /* synthetic */ Image f28581f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C10306a(C43075l lVar, C10303b bVar, Image image) {
                    super(0);
                    this.f28579d = lVar;
                    this.f28580e = bVar;
                    this.f28581f = image;
                }

                /* renamed from: b */
                public final Boolean invoke() {
                    C43075l lVar = this.f28579d;
                    if (lVar != null) {
                        lVar.invoke(this.f28580e.mo26910h(this.f28581f));
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10305b(C43075l lVar, C10303b bVar, Image image) {
                super(1);
                this.f28576d = lVar;
                this.f28577e = bVar;
                this.f28578f = image;
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                return C18368l.m62771t(jVar, new C10306a(this.f28576d, this.f28577e, this.f28578f));
            }
        }

        static {
            Class<C10303b> cls = C10303b.class;
            f28570g = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "amountText", "getAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "showAmount", "getShowAmount()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isBadgeVisible", "isBadgeVisible()Z", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10303b(C10013s4 s4Var) {
            super(s4Var, C17779d.card_shape_square_height, (DefaultConstructorMarker) null);
            C41536l.m120489i(s4Var, "binding");
            TextView textView = s4Var.f27541m;
            C41536l.m120488h(textView, "binding.title");
            this.f28571c = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView = s4Var.f27533e;
            C41536l.m120488h(appCompatTextView, "binding.amount");
            this.f28572d = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            HideableAmountView hideableAmountView = s4Var.f27534f;
            C41536l.m120488h(hideableAmountView, "binding.amountContainer");
            this.f28573e = new C18389z(hideableAmountView);
            NotificationBadgeView notificationBadgeView = s4Var.f27535g;
            C41536l.m120488h(notificationBadgeView, "binding.badge");
            this.f28574f = new C18365j0(notificationBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            C1314o.m4567i(s4Var.f27533e, 1);
        }

        /* renamed from: t */
        private final void m37575t(int i, int i2, int i3, int i4) {
            Integer num;
            ((C10013s4) mo26904b()).f27540l.setBackgroundResource(i);
            C1314o.m4575q(((C10013s4) mo26904b()).f27541m, i2);
            C1314o.m4575q(((C10013s4) mo26904b()).f27533e, i3);
            ((C10013s4) mo26904b()).f27539k.setVisibility(i4);
            HideableAmountView hideableAmountView = ((C10013s4) mo26904b()).f27534f;
            AppCompatTextView appCompatTextView = ((C10013s4) mo26904b()).f27533e;
            C41536l.m120488h(appCompatTextView, "binding.amount");
            ColorStateList textColors = appCompatTextView.getTextColors();
            if (textColors != null) {
                num = Integer.valueOf(textColors.getDefaultColor());
            } else {
                num = null;
            }
            hideableAmountView.setDotsTintColor(num);
        }

        /* renamed from: f */
        public boolean mo26908f() {
            return this.f28573e.getValue(this, f28570g[2]).booleanValue();
        }

        /* renamed from: g */
        public void mo26909g(CharSequence charSequence) {
            this.f28572d.setValue(this, f28570g[1], charSequence);
        }

        /* renamed from: i */
        public void mo26911i(boolean z) {
            this.f28574f.mo46151c(this, f28570g[3], z);
        }

        /* renamed from: k */
        public void mo26913k(Image image, C43075l lVar) {
            CropImageView cropImageView = ((C10013s4) mo26904b()).f27536h;
            C41536l.m120488h(cropImageView, "setCardBackground$lambda$0");
            C18368l.m62777z(cropImageView, image, new C10305b(lVar, this, image));
            cropImageView.mo35304f();
        }

        /* renamed from: m */
        public void mo26914m(C13473a.C13476b bVar) {
            C41536l.m120489i(bVar, "theme");
            ((C10013s4) mo26904b()).f27537i.setVisibility(8);
            int i = C10304a.f28575a[bVar.ordinal()];
            if (i == 1) {
                m37575t(C17780e.selector_product_card_white, C17786k.TextCaption2White500Left, C17786k.TextH3White500Left, 8);
            } else if (i == 2) {
                m37575t(C17780e.selector_product_card_black, C17786k.TextCaption2Black200Left, C17786k.TextH3Black400Left, 8);
            } else if (i == 3) {
                m37575t(C17780e.selector_product_card_color, C17786k.TextCaption2InvertComponents200Left, C17786k.TextH3InvertComponents400Left, 0);
                ((C10013s4) mo26904b()).f27537i.setVisibility(0);
                C10299a.m37542l(this, new Image.Resource(C17780e.gradient_base_solid_primary_positive, (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
            } else if (i == 4) {
                m37575t(C17780e.selector_product_card_clear, C17786k.TextCaption2InvertComponents200Left, C17786k.TextH3InvertComponents400Left, 0);
                CropImageView cropImageView = ((C10013s4) mo26904b()).f27536h;
                C41536l.m120488h(cropImageView, "binding.cardBackgroundImage");
                mo26903a(cropImageView);
            } else {
                throw new IllegalStateException("Unsupported theme");
            }
        }

        /* renamed from: n */
        public void mo26915n(List list) {
            C41536l.m120489i(list, "creditCards");
            CreditCardsBadgeView creditCardsBadgeView = ((C10013s4) mo26904b()).f27538j;
            C41536l.m120488h(creditCardsBadgeView, "binding.creditCards");
            C18368l.m62751F(creditCardsBadgeView, !list.isEmpty(), false, 2, (Object) null);
            ((C10013s4) mo26904b()).f27538j.setCards((List<? extends C18763a>) list);
        }

        /* renamed from: o */
        public void mo26916o(Image image) {
            AppCompatImageView appCompatImageView = ((C10013s4) mo26904b()).f27539k;
            C41536l.m120488h(appCompatImageView, "binding.icon");
            C18368l.m62746A(appCompatImageView, image, (C43075l) null, 2, (Object) null);
        }

        /* renamed from: p */
        public void mo26917p(List list) {
            C41536l.m120489i(list, "creditCards");
            throw new IllegalStateException("Unsupported cards");
        }

        /* renamed from: q */
        public void mo26918q(boolean z) {
            this.f28573e.mo46189b(this, f28570g[2], z);
        }

        /* renamed from: r */
        public void mo26919r(CharSequence charSequence) {
            this.f28571c.setValue(this, f28570g[0], charSequence);
        }

        /* renamed from: s */
        public Void mo26912j(View view) {
            throw new UnsupportedOperationException("Square version doesn't support bottom component");
        }
    }

    /* renamed from: bj.a$c */
    public static class C10307c extends C10299a {

        /* renamed from: g */
        static final /* synthetic */ C40303i[] f28582g;

        /* renamed from: c */
        private final C18355e0 f28583c;

        /* renamed from: d */
        private final C18355e0 f28584d;

        /* renamed from: e */
        private final C18389z f28585e;

        /* renamed from: f */
        private final C18365j0 f28586f;

        /* renamed from: bj.a$c$a */
        public /* synthetic */ class C10308a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f28587a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    ge.bog.designsystem.components.productcards.basecard.a$b[] r0 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    ge.bog.designsystem.components.productcards.basecard.a$b r1 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.COLOR     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    ge.bog.designsystem.components.productcards.basecard.a$b r1 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.CLEAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f28587a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p365bj.C10299a.C10307c.C10308a.<clinit>():void");
            }
        }

        /* renamed from: bj.a$c$b */
        static final class C10309b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C43075l f28588d;

            /* renamed from: e */
            final /* synthetic */ C10307c f28589e;

            /* renamed from: f */
            final /* synthetic */ Image f28590f;

            /* renamed from: bj.a$c$b$a */
            static final class C10310a extends C41537m implements C43064a {

                /* renamed from: d */
                final /* synthetic */ C43075l f28591d;

                /* renamed from: e */
                final /* synthetic */ C10307c f28592e;

                /* renamed from: f */
                final /* synthetic */ Image f28593f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C10310a(C43075l lVar, C10307c cVar, Image image) {
                    super(0);
                    this.f28591d = lVar;
                    this.f28592e = cVar;
                    this.f28593f = image;
                }

                /* renamed from: b */
                public final Boolean invoke() {
                    C43075l lVar = this.f28591d;
                    if (lVar != null) {
                        lVar.invoke(this.f28592e.mo26910h(this.f28593f));
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10309b(C43075l lVar, C10307c cVar, Image image) {
                super(1);
                this.f28588d = lVar;
                this.f28589e = cVar;
                this.f28590f = image;
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                return C18368l.m62771t(jVar, new C10310a(this.f28588d, this.f28589e, this.f28590f));
            }
        }

        static {
            Class<C10307c> cls = C10307c.class;
            f28582g = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "amountText", "getAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "showAmount", "getShowAmount()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isBadgeVisible", "isBadgeVisible()Z", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10307c(C10020t4 t4Var) {
            super(t4Var, C17779d.card_shape_wide_height, (DefaultConstructorMarker) null);
            C41536l.m120489i(t4Var, "binding");
            TextView textView = t4Var.f27598o;
            C41536l.m120488h(textView, "binding.title");
            this.f28583c = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView = t4Var.f27588e;
            C41536l.m120488h(appCompatTextView, "binding.amount");
            this.f28584d = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            HideableAmountView hideableAmountView = t4Var.f27589f;
            C41536l.m120488h(hideableAmountView, "binding.amountContainer");
            this.f28585e = new C18389z(hideableAmountView);
            NotificationBadgeView notificationBadgeView = t4Var.f27590g;
            C41536l.m120488h(notificationBadgeView, "binding.badge");
            this.f28586f = new C18365j0(notificationBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            C1314o.m4567i(t4Var.f27588e, 1);
        }

        /* renamed from: s */
        private final void m37590s(C13473a.C13476b bVar) {
            Integer num;
            ((C10020t4) mo26904b()).f27596m.setBackgroundResource(bVar.mo36575f());
            C1314o.m4575q(((C10020t4) mo26904b()).f27598o, bVar.mo36578l());
            C1314o.m4575q(((C10020t4) mo26904b()).f27588e, bVar.mo36573c());
            ((C10020t4) mo26904b()).f27598o.setTextColor(bVar.mo36577h().mo35260a(mo26905c()));
            ((C10020t4) mo26904b()).f27588e.setTextColor(bVar.mo36572b().mo35260a(mo26905c()));
            ((C10020t4) mo26904b()).f27595l.setVisibility(bVar.mo36574e());
            HideableAmountView hideableAmountView = ((C10020t4) mo26904b()).f27589f;
            AppCompatTextView appCompatTextView = ((C10020t4) mo26904b()).f27588e;
            C41536l.m120488h(appCompatTextView, "binding.amount");
            ColorStateList textColors = appCompatTextView.getTextColors();
            if (textColors != null) {
                num = Integer.valueOf(textColors.getDefaultColor());
            } else {
                num = null;
            }
            hideableAmountView.setDotsTintColor(num);
        }

        /* renamed from: f */
        public boolean mo26908f() {
            return this.f28585e.getValue(this, f28582g[2]).booleanValue();
        }

        /* renamed from: g */
        public void mo26909g(CharSequence charSequence) {
            this.f28584d.setValue(this, f28582g[1], charSequence);
        }

        /* renamed from: i */
        public void mo26911i(boolean z) {
            this.f28586f.mo46151c(this, f28582g[3], z);
        }

        /* renamed from: j */
        public void mo26912j(View view) {
            C41238w wVar;
            if (view != null) {
                ((C10020t4) mo26904b()).f27591h.setVisibility(0);
                ((C10020t4) mo26904b()).f27591h.removeAllViews();
                ((C10020t4) mo26904b()).f27591h.addView(view);
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                ((C10020t4) mo26904b()).f27591h.setVisibility(8);
            }
        }

        /* renamed from: k */
        public void mo26913k(Image image, C43075l lVar) {
            CropImageView cropImageView = ((C10020t4) mo26904b()).f27592i;
            C41536l.m120488h(cropImageView, "setCardBackground$lambda$0");
            C18368l.m62777z(cropImageView, image, new C10309b(lVar, this, image));
            cropImageView.mo35304f();
        }

        /* renamed from: m */
        public void mo26914m(C13473a.C13476b bVar) {
            C41536l.m120489i(bVar, "theme");
            ((C10020t4) mo26904b()).f27593j.setVisibility(8);
            m37590s(bVar);
            int i = C10308a.f28587a[bVar.ordinal()];
            if (i == 1) {
                ((C10020t4) mo26904b()).f27593j.setVisibility(0);
                C10299a.m37542l(this, new Image.Resource(C17780e.gradient_base_solid_primary_positive, (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
            } else if (i == 2) {
                CropImageView cropImageView = ((C10020t4) mo26904b()).f27592i;
                C41536l.m120488h(cropImageView, "binding.cardBackgroundImage");
                mo26903a(cropImageView);
            }
        }

        /* renamed from: n */
        public void mo26915n(List list) {
            C41536l.m120489i(list, "creditCards");
            CreditCardsBadgeView creditCardsBadgeView = ((C10020t4) mo26904b()).f27594k;
            C41536l.m120488h(creditCardsBadgeView, "binding.creditCards");
            C18368l.m62751F(creditCardsBadgeView, !list.isEmpty(), false, 2, (Object) null);
            ((C10020t4) mo26904b()).f27594k.setCards((List<? extends C18763a>) list);
        }

        /* renamed from: o */
        public void mo26916o(Image image) {
            AppCompatImageView appCompatImageView = ((C10020t4) mo26904b()).f27595l;
            C41536l.m120488h(appCompatImageView, "binding.icon");
            C18368l.m62746A(appCompatImageView, image, (C43075l) null, 2, (Object) null);
        }

        /* renamed from: p */
        public void mo26917p(List list) {
            C41536l.m120489i(list, "creditCards");
            throw new IllegalStateException("Unsupported cards");
        }

        /* renamed from: q */
        public void mo26918q(boolean z) {
            this.f28585e.mo46189b(this, f28582g[2], z);
        }

        /* renamed from: r */
        public void mo26919r(CharSequence charSequence) {
            this.f28583c.setValue(this, f28582g[0], charSequence);
        }
    }

    /* renamed from: bj.a$d */
    static final class C10311d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C10311d f28594d = new C10311d();

        C10311d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo26927a(C13473a.C13476b bVar) {
            C41536l.m120489i(bVar, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26927a((C13473a.C13476b) obj);
            return C41238w.f97225a;
        }
    }

    public /* synthetic */ C10299a(C6201a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i);
    }

    /* renamed from: l */
    public static /* synthetic */ void m37542l(C10299a aVar, Image image, C43075l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                lVar = C10311d.f28594d;
            }
            aVar.mo26913k(image, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCardBackground");
    }

    /* renamed from: a */
    public final void mo26903a(ImageView imageView) {
        C41536l.m120489i(imageView, "cardBackgroundImage");
        imageView.setImageDrawable((Drawable) null);
        imageView.setBackground((Drawable) null);
    }

    /* renamed from: b */
    public final C6201a mo26904b() {
        return this.f28557a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Context mo26905c() {
        Context context = this.f28557a.mo3946b().getContext();
        C41536l.m120488h(context, "binding.root.context");
        return context;
    }

    /* renamed from: d */
    public final int mo26906d() {
        return this.f28558b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final LayerView mo26907e() {
        ViewParent parent = this.f28557a.mo3946b().getParent();
        C41536l.m120487g(parent, "null cannot be cast to non-null type ge.bog.designsystem.components.layersandshadows.LayerView");
        return (LayerView) parent;
    }

    /* renamed from: f */
    public abstract boolean mo26908f();

    /* renamed from: g */
    public abstract void mo26909g(CharSequence charSequence);

    /* renamed from: h */
    public final C13473a.C13476b mo26910h(Image image) {
        Image.Url url;
        C13473a.C13476b bVar;
        Image.Placeholder i;
        Boolean bool = null;
        if (image instanceof Image.Url) {
            url = (Image.Url) image;
        } else {
            url = null;
        }
        if (!(url == null || (i = url.mo35409i()) == null)) {
            bool = i.mo35370b();
        }
        if (bool == null) {
            bVar = C13473a.C13476b.CLEAR;
        } else if (C41536l.m120484d(bool, Boolean.TRUE)) {
            bVar = C13473a.C13476b.BLACK;
        } else {
            bVar = C13473a.C13476b.WHITE;
        }
        mo26914m(bVar);
        return bVar;
    }

    /* renamed from: i */
    public abstract void mo26911i(boolean z);

    /* renamed from: j */
    public abstract void mo26912j(View view);

    /* renamed from: k */
    public abstract void mo26913k(Image image, C43075l lVar);

    /* renamed from: m */
    public abstract void mo26914m(C13473a.C13476b bVar);

    /* renamed from: n */
    public abstract void mo26915n(List list);

    /* renamed from: o */
    public abstract void mo26916o(Image image);

    /* renamed from: p */
    public abstract void mo26917p(List list);

    /* renamed from: q */
    public abstract void mo26918q(boolean z);

    /* renamed from: r */
    public abstract void mo26919r(CharSequence charSequence);

    private C10299a(C6201a aVar, int i) {
        this.f28557a = aVar;
        this.f28558b = -1;
        if (i != 0) {
            this.f28558b = mo26905c().getResources().getDimensionPixelSize(i);
        }
        mo26907e().setLayerStyle(C17786k.f49833r);
        mo26907e().setBackgroundColor(C18368l.m62755d(mo26905c(), C17777b.f49596k));
    }
}
