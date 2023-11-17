package p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager */
public final class StickyHeaderLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: U */
    public static final C34655a f83768U = new C34655a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: L */
    public RecyclerView.C1736h f83769L;

    /* renamed from: M */
    private float f83770M;

    /* renamed from: N */
    private float f83771N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final List f83772O;

    /* renamed from: P */
    private final C34658b f83773P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public View f83774Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public int f83775R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public int f83776S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public int f83777T;

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$SavedState */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C34654a();

        /* renamed from: d */
        private final Parcelable f83778d;

        /* renamed from: e */
        private final int f83779e;

        /* renamed from: f */
        private final int f83780f;

        /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$SavedState$a */
        public static final class C34654a implements Parcelable.Creator {
            /* renamed from: a */
            public final SavedState createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            }

            /* renamed from: b */
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, int i, int i2) {
            this.f83778d = parcelable;
            this.f83779e = i;
            this.f83780f = i2;
        }

        /* renamed from: a */
        public final int mo84603a() {
            return this.f83780f;
        }

        /* renamed from: b */
        public final int mo84604b() {
            return this.f83779e;
        }

        /* renamed from: d */
        public final Parcelable mo84605d() {
            return this.f83778d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) obj;
            return C41536l.m120484d(this.f83778d, savedState.f83778d) && this.f83779e == savedState.f83779e && this.f83780f == savedState.f83780f;
        }

        public int hashCode() {
            Parcelable parcelable = this.f83778d;
            return ((((parcelable == null ? 0 : parcelable.hashCode()) * 31) + this.f83779e) * 31) + this.f83780f;
        }

        public String toString() {
            Parcelable parcelable = this.f83778d;
            int i = this.f83779e;
            int i2 = this.f83780f;
            return "SavedState(superState=" + parcelable + ", scrollPosition=" + i + ", scrollOffset=" + i2 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f83778d, i);
            parcel.writeInt(this.f83779e);
            parcel.writeInt(this.f83780f);
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$a */
    public static final class C34655a {

        /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$a$a */
        public interface C34656a {

            /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$a$a$a */
            public static final class C34657a {
                /* renamed from: a */
                public static void m101834a(C34656a aVar, View view) {
                    C41536l.m120489i(view, "stickyHeader");
                }

                /* renamed from: b */
                public static void m101835b(C34656a aVar, View view) {
                    C41536l.m120489i(view, "stickyHeader");
                }
            }

            /* renamed from: b */
            boolean mo84615b(int i);

            /* renamed from: d */
            void mo84616d(View view);

            /* renamed from: e */
            void mo84617e(View view);
        }

        private C34655a() {
        }

        public /* synthetic */ C34655a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$b */
    private final class C34658b extends RecyclerView.C1739j {
        public C34658b() {
        }

        /* renamed from: h */
        private final void m101836h(int i) {
            int intValue = ((Number) StickyHeaderLinearLayoutManager.this.f83772O.remove(i)).intValue();
            int k3 = StickyHeaderLinearLayoutManager.this.m101773B3(intValue);
            if (k3 != -1) {
                StickyHeaderLinearLayoutManager.this.f83772O.add(k3, Integer.valueOf(intValue));
            } else {
                StickyHeaderLinearLayoutManager.this.f83772O.add(Integer.valueOf(intValue));
            }
        }

        /* JADX WARNING: type inference failed for: r4v1, types: [androidx.recyclerview.widget.RecyclerView$h] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo5583a() {
            /*
                r6 = this;
                ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager r0 = p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.this
                java.util.List r0 = r0.f83772O
                r0.clear()
                ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager r0 = p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.this
                androidx.recyclerview.widget.RecyclerView$h r0 = r0.f83769L
                r1 = 0
                if (r0 == 0) goto L_0x0017
                int r0 = r0.getItemCount()
                goto L_0x0018
            L_0x0017:
                r0 = r1
            L_0x0018:
                r2 = r1
            L_0x0019:
                r3 = 0
                if (r2 >= r0) goto L_0x0043
                ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager r4 = p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.this
                androidx.recyclerview.widget.RecyclerView$h r4 = r4.f83769L
                boolean r5 = r4 instanceof p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.C34655a.C34656a
                if (r5 == 0) goto L_0x0029
                r3 = r4
                ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$a$a r3 = (p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.C34655a.C34656a) r3
            L_0x0029:
                if (r3 == 0) goto L_0x0030
                boolean r3 = r3.mo84615b(r2)
                goto L_0x0031
            L_0x0030:
                r3 = r1
            L_0x0031:
                if (r3 == 0) goto L_0x0040
                ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager r3 = p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.this
                java.util.List r3 = r3.f83772O
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r3.add(r4)
            L_0x0040:
                int r2 = r2 + 1
                goto L_0x0019
            L_0x0043:
                ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager r0 = p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.this
                android.view.View r0 = r0.f83774Q
                if (r0 == 0) goto L_0x0066
                ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager r0 = p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.this
                java.util.List r0 = r0.f83772O
                ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager r1 = p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.this
                int r1 = r1.f83775R
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L_0x0066
                ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager r0 = p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.this
                r0.m101780I3(r3)
            L_0x0066:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.C34658b.mo5583a():void");
        }

        /* renamed from: d */
        public void mo5586d(int i, int i2) {
            C34655a.C34656a aVar;
            boolean z;
            int size = StickyHeaderLinearLayoutManager.this.f83772O.size();
            if (size > 0) {
                int k3 = StickyHeaderLinearLayoutManager.this.m101773B3(i);
                while (k3 != -1 && k3 < size) {
                    StickyHeaderLinearLayoutManager.this.f83772O.set(k3, Integer.valueOf(((Number) StickyHeaderLinearLayoutManager.this.f83772O.get(k3)).intValue() + i2));
                    k3++;
                }
            }
            int i3 = i2 + i;
            while (i < i3) {
                RecyclerView.C1736h l3 = StickyHeaderLinearLayoutManager.this.f83769L;
                if (l3 instanceof C34655a.C34656a) {
                    aVar = (C34655a.C34656a) l3;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    z = aVar.mo84615b(i);
                } else {
                    z = false;
                }
                if (z) {
                    int k32 = StickyHeaderLinearLayoutManager.this.m101773B3(i);
                    if (k32 != -1) {
                        StickyHeaderLinearLayoutManager.this.f83772O.add(k32, Integer.valueOf(i));
                    } else {
                        StickyHeaderLinearLayoutManager.this.f83772O.add(Integer.valueOf(i));
                    }
                }
                i++;
            }
        }

        /* renamed from: e */
        public void mo5587e(int i, int i2, int i3) {
            int size = StickyHeaderLinearLayoutManager.this.f83772O.size();
            if (size <= 0) {
                return;
            }
            if (i < i2) {
                int k3 = StickyHeaderLinearLayoutManager.this.m101773B3(i);
                while (k3 != -1 && k3 < size) {
                    int intValue = ((Number) StickyHeaderLinearLayoutManager.this.f83772O.get(k3)).intValue();
                    if (intValue >= i && intValue < i + i3) {
                        StickyHeaderLinearLayoutManager.this.f83772O.set(k3, Integer.valueOf(intValue - (i2 - i)));
                        m101836h(k3);
                    } else if (intValue >= i + i3 && intValue <= i2) {
                        StickyHeaderLinearLayoutManager.this.f83772O.set(k3, Integer.valueOf(intValue - i3));
                        m101836h(k3);
                    } else {
                        return;
                    }
                    k3++;
                }
                return;
            }
            int k32 = StickyHeaderLinearLayoutManager.this.m101773B3(i2);
            while (k32 != -1 && k32 < size) {
                int intValue2 = ((Number) StickyHeaderLinearLayoutManager.this.f83772O.get(k32)).intValue();
                if (intValue2 < i || intValue2 >= i + i3) {
                    boolean z = false;
                    if (i2 <= intValue2 && intValue2 <= i) {
                        z = true;
                    }
                    if (z) {
                        StickyHeaderLinearLayoutManager.this.f83772O.set(k32, Integer.valueOf(intValue2 + i3));
                        m101836h(k32);
                    } else {
                        return;
                    }
                } else {
                    StickyHeaderLinearLayoutManager.this.f83772O.set(k32, Integer.valueOf(intValue2 + (i2 - i)));
                    m101836h(k32);
                }
                k32++;
            }
        }

        /* renamed from: f */
        public void mo5588f(int i, int i2) {
            int size = StickyHeaderLinearLayoutManager.this.f83772O.size();
            if (size > 0) {
                int i3 = i + i2;
                int i4 = i3 - 1;
                if (i <= i4) {
                    while (true) {
                        int j3 = StickyHeaderLinearLayoutManager.this.m101808z3(i4);
                        if (j3 != -1) {
                            StickyHeaderLinearLayoutManager.this.f83772O.remove(j3);
                            size--;
                        }
                        if (i4 == i) {
                            break;
                        }
                        i4--;
                    }
                }
                if (StickyHeaderLinearLayoutManager.this.f83774Q != null && !StickyHeaderLinearLayoutManager.this.f83772O.contains(Integer.valueOf(StickyHeaderLinearLayoutManager.this.f83775R))) {
                    StickyHeaderLinearLayoutManager.this.m101780I3((RecyclerView.C1759w) null);
                }
                int k3 = StickyHeaderLinearLayoutManager.this.m101773B3(i3);
                while (k3 != -1 && k3 < size) {
                    StickyHeaderLinearLayoutManager.this.f83772O.set(k3, Integer.valueOf(((Number) StickyHeaderLinearLayoutManager.this.f83772O.get(k3)).intValue() - i2));
                    k3++;
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$c */
    public static final class C34659c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        final /* synthetic */ View f83782d;

        /* renamed from: e */
        final /* synthetic */ StickyHeaderLinearLayoutManager f83783e;

        C34659c(View view, StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager) {
            this.f83782d = view;
            this.f83783e = stickyHeaderLinearLayoutManager;
        }

        public void onGlobalLayout() {
            this.f83782d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.f83783e.f83776S != -1) {
                StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = this.f83783e;
                stickyHeaderLinearLayoutManager.mo5201P2(stickyHeaderLinearLayoutManager.f83776S, this.f83783e.f83777T);
                this.f83783e.m101783L3(-1, Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$d */
    static final class C34660d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StickyHeaderLinearLayoutManager f83784d;

        /* renamed from: e */
        final /* synthetic */ RecyclerView.C1726b0 f83785e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34660d(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.C1726b0 b0Var) {
            super(0);
            this.f83784d = stickyHeaderLinearLayoutManager;
            this.f83785e = b0Var;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo5190B(this.f83785e));
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$e */
    static final class C34661e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StickyHeaderLinearLayoutManager f83786d;

        /* renamed from: e */
        final /* synthetic */ RecyclerView.C1726b0 f83787e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34661e(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.C1726b0 b0Var) {
            super(0);
            this.f83786d = stickyHeaderLinearLayoutManager;
            this.f83787e = b0Var;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo5146C(this.f83787e));
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$f */
    static final class C34662f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StickyHeaderLinearLayoutManager f83788d;

        /* renamed from: e */
        final /* synthetic */ RecyclerView.C1726b0 f83789e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34662f(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.C1726b0 b0Var) {
            super(0);
            this.f83788d = stickyHeaderLinearLayoutManager;
            this.f83789e = b0Var;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo5147D(this.f83789e));
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$g */
    static final class C34663g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StickyHeaderLinearLayoutManager f83790d;

        /* renamed from: e */
        final /* synthetic */ int f83791e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34663g(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i) {
            super(0);
            this.f83790d = stickyHeaderLinearLayoutManager;
            this.f83791e = i;
        }

        /* renamed from: b */
        public final PointF invoke() {
            return StickyHeaderLinearLayoutManager.super.mo5209a(this.f83791e);
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$h */
    static final class C34664h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StickyHeaderLinearLayoutManager f83792d;

        /* renamed from: e */
        final /* synthetic */ RecyclerView.C1726b0 f83793e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34664h(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.C1726b0 b0Var) {
            super(0);
            this.f83792d = stickyHeaderLinearLayoutManager;
            this.f83793e = b0Var;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo5195E(this.f83793e));
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$i */
    static final class C34665i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StickyHeaderLinearLayoutManager f83794d;

        /* renamed from: e */
        final /* synthetic */ RecyclerView.C1726b0 f83795e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34665i(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.C1726b0 b0Var) {
            super(0);
            this.f83794d = stickyHeaderLinearLayoutManager;
            this.f83795e = b0Var;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo5148F(this.f83795e));
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$j */
    static final class C34666j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StickyHeaderLinearLayoutManager f83796d;

        /* renamed from: e */
        final /* synthetic */ RecyclerView.C1726b0 f83797e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34666j(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.C1726b0 b0Var) {
            super(0);
            this.f83796d = stickyHeaderLinearLayoutManager;
            this.f83797e = b0Var;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo5150G(this.f83797e));
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$k */
    static final class C34667k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StickyHeaderLinearLayoutManager f83798d;

        /* renamed from: e */
        final /* synthetic */ View f83799e;

        /* renamed from: f */
        final /* synthetic */ int f83800f;

        /* renamed from: g */
        final /* synthetic */ RecyclerView.C1759w f83801g;

        /* renamed from: h */
        final /* synthetic */ RecyclerView.C1726b0 f83802h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34667k(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, View view, int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
            super(0);
            this.f83798d = stickyHeaderLinearLayoutManager;
            this.f83799e = view;
            this.f83800f = i;
            this.f83801g = wVar;
            this.f83802h = b0Var;
        }

        /* renamed from: b */
        public final View invoke() {
            return StickyHeaderLinearLayoutManager.super.mo5159U0(this.f83799e, this.f83800f, this.f83801g, this.f83802h);
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$l */
    static final class C34668l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StickyHeaderLinearLayoutManager f83803d;

        /* renamed from: e */
        final /* synthetic */ RecyclerView.C1759w f83804e;

        /* renamed from: f */
        final /* synthetic */ RecyclerView.C1726b0 f83805f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34668l(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
            super(0);
            this.f83803d = stickyHeaderLinearLayoutManager;
            this.f83804e = wVar;
            this.f83805f = b0Var;
        }

        public final void invoke() {
            StickyHeaderLinearLayoutManager.super.mo5170i1(this.f83804e, this.f83805f);
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$m */
    static final class C34669m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StickyHeaderLinearLayoutManager f83806d;

        /* renamed from: e */
        final /* synthetic */ int f83807e;

        /* renamed from: f */
        final /* synthetic */ RecyclerView.C1759w f83808f;

        /* renamed from: g */
        final /* synthetic */ RecyclerView.C1726b0 f83809g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34669m(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
            super(0);
            this.f83806d = stickyHeaderLinearLayoutManager;
            this.f83807e = i;
            this.f83808f = wVar;
            this.f83809g = b0Var;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo5152I1(this.f83807e, this.f83808f, this.f83809g));
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$n */
    static final class C34670n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StickyHeaderLinearLayoutManager f83810d;

        /* renamed from: e */
        final /* synthetic */ int f83811e;

        /* renamed from: f */
        final /* synthetic */ RecyclerView.C1759w f83812f;

        /* renamed from: g */
        final /* synthetic */ RecyclerView.C1726b0 f83813g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34670n(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
            super(0);
            this.f83810d = stickyHeaderLinearLayoutManager;
            this.f83811e = i;
            this.f83812f = wVar;
            this.f83813g = b0Var;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo5153K1(this.f83811e, this.f83812f, this.f83813g));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickyHeaderLinearLayoutManager(Context context, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? false : z);
    }

    /* renamed from: A3 */
    private final int m101772A3(int i) {
        int size = this.f83772O.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (((Number) this.f83772O.get(i3)).intValue() > i) {
                size = i3 - 1;
            } else {
                if (i3 < this.f83772O.size() - 1) {
                    int i4 = i3 + 1;
                    if (((Number) this.f83772O.get(i4)).intValue() <= i) {
                        i2 = i4;
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public final int m101773B3(int i) {
        int size = this.f83772O.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (((Number) this.f83772O.get(i4)).intValue() >= i) {
                    size = i4;
                }
            }
            if (((Number) this.f83772O.get(i3)).intValue() >= i) {
                return i3;
            }
            i2 = i3 + 1;
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: C3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final float m101774C3(android.view.View r7, android.view.View r8) {
        /*
            r6 = this;
            int r0 = r6.mo5191B2()
            if (r0 != 0) goto L_0x0060
            float r0 = r6.f83770M
            boolean r1 = r6.mo5193C2()
            if (r1 == 0) goto L_0x0019
            int r1 = r6.mo5716x0()
            int r2 = r7.getWidth()
            int r1 = r1 - r2
            float r1 = (float) r1
            float r0 = r0 + r1
        L_0x0019:
            if (r8 == 0) goto L_0x005f
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            r3 = 0
            if (r2 == 0) goto L_0x0027
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L_0x0028
        L_0x0027:
            r1 = r3
        L_0x0028:
            r2 = 0
            if (r1 == 0) goto L_0x002e
            int r1 = r1.leftMargin
            goto L_0x002f
        L_0x002e:
            r1 = r2
        L_0x002f:
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x003a
            r3 = r4
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L_0x003a:
            if (r3 == 0) goto L_0x003e
            int r2 = r3.rightMargin
        L_0x003e:
            boolean r3 = r6.mo5193C2()
            if (r3 == 0) goto L_0x004f
            int r7 = r8.getRight()
            int r7 = r7 + r2
            float r7 = (float) r7
            float r7 = ze1.C43429k.m124584c(r7, r0)
            goto L_0x005e
        L_0x004f:
            int r8 = r8.getLeft()
            int r8 = r8 - r1
            int r7 = r7.getWidth()
            int r8 = r8 - r7
            float r7 = (float) r8
            float r7 = ze1.C43429k.m124587f(r7, r0)
        L_0x005e:
            r0 = r7
        L_0x005f:
            return r0
        L_0x0060:
            float r7 = r6.f83770M
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.m101774C3(android.view.View, android.view.View):float");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: D3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final float m101775D3(android.view.View r7, android.view.View r8) {
        /*
            r6 = this;
            int r0 = r6.mo5191B2()
            r1 = 1
            if (r0 != r1) goto L_0x0061
            float r0 = r6.f83771N
            boolean r1 = r6.mo5193C2()
            if (r1 == 0) goto L_0x001a
            int r1 = r6.mo5684i0()
            int r2 = r7.getHeight()
            int r1 = r1 - r2
            float r1 = (float) r1
            float r0 = r0 + r1
        L_0x001a:
            if (r8 == 0) goto L_0x0060
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            r3 = 0
            if (r2 == 0) goto L_0x0028
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L_0x0029
        L_0x0028:
            r1 = r3
        L_0x0029:
            r2 = 0
            if (r1 == 0) goto L_0x002f
            int r1 = r1.bottomMargin
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x003b
            r3 = r4
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L_0x003b:
            if (r3 == 0) goto L_0x003f
            int r2 = r3.topMargin
        L_0x003f:
            boolean r3 = r6.mo5193C2()
            if (r3 == 0) goto L_0x0050
            int r7 = r8.getBottom()
            int r7 = r7 + r1
            float r7 = (float) r7
            float r7 = ze1.C43429k.m124584c(r7, r0)
            goto L_0x005f
        L_0x0050:
            int r8 = r8.getTop()
            int r8 = r8 - r2
            int r7 = r7.getHeight()
            int r8 = r8 - r7
            float r7 = (float) r8
            float r7 = ze1.C43429k.m124587f(r7, r0)
        L_0x005f:
            r0 = r7
        L_0x0060:
            return r0
        L_0x0061:
            float r7 = r6.f83771N
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.m101775D3(android.view.View, android.view.View):float");
    }

    /* renamed from: E3 */
    private final boolean m101776E3(View view) {
        if (mo5191B2() == 1) {
            if (mo5193C2()) {
                if (((float) view.getBottom()) - view.getTranslationY() <= ((float) mo5684i0()) + this.f83771N) {
                    return false;
                }
            } else if (((float) view.getTop()) + view.getTranslationY() >= this.f83771N) {
                return false;
            }
        } else if (mo5193C2()) {
            if (((float) view.getRight()) - view.getTranslationX() <= ((float) mo5716x0()) + this.f83770M) {
                return false;
            }
        } else if (((float) view.getLeft()) + view.getTranslationX() >= this.f83770M) {
            return false;
        }
        return true;
    }

    /* renamed from: F3 */
    private final boolean m101777F3(View view, RecyclerView.C1752q qVar) {
        if (qVar.mo5731e() || qVar.mo5732f()) {
            return false;
        }
        if (mo5191B2() == 1) {
            if (mo5193C2()) {
                if (((float) view.getTop()) + view.getTranslationY() > ((float) mo5684i0()) + this.f83771N) {
                    return false;
                }
            } else if (((float) view.getBottom()) - view.getTranslationY() < this.f83771N) {
                return false;
            }
        } else if (mo5193C2()) {
            if (((float) view.getLeft()) + view.getTranslationX() > ((float) mo5716x0()) + this.f83770M) {
                return false;
            }
        } else if (((float) view.getRight()) - view.getTranslationX() < this.f83770M) {
            return false;
        }
        return true;
    }

    /* renamed from: G3 */
    private final void m101778G3(View view) {
        mo5639L0(view, 0, 0);
        if (mo5191B2() == 1) {
            view.layout(getPaddingLeft(), 0, mo5716x0() - getPaddingRight(), view.getMeasuredHeight());
        } else {
            view.layout(0, getPaddingTop(), view.getMeasuredWidth(), mo5684i0() - getPaddingBottom());
        }
    }

    /* renamed from: H3 */
    private final Object m101779H3(C43064a aVar) {
        View view = this.f83774Q;
        if (view != null) {
            mo5633I(view);
        }
        Object invoke = aVar.invoke();
        View view2 = this.f83774Q;
        if (view2 != null) {
            mo5702r(view2);
        }
        return invoke;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [androidx.recyclerview.widget.RecyclerView$h] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: I3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m101780I3(androidx.recyclerview.widget.RecyclerView.C1759w r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.f83774Q
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r1 = 0
            r4.f83774Q = r1
            r2 = -1
            r4.f83775R = r2
            r2 = 0
            r0.setTranslationX(r2)
            r0.setTranslationY(r2)
            androidx.recyclerview.widget.RecyclerView$h r2 = r4.f83769L
            boolean r3 = r2 instanceof p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.C34655a.C34656a
            if (r3 == 0) goto L_0x001b
            r1 = r2
            ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager$a$a r1 = (p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.C34655a.C34656a) r1
        L_0x001b:
            if (r1 == 0) goto L_0x0020
            r1.mo84617e(r0)
        L_0x0020:
            r4.mo5664X1(r0)
            r4.mo5623B1(r0)
            if (r5 == 0) goto L_0x002b
            r5.mo5759H(r0)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.m101780I3(androidx.recyclerview.widget.RecyclerView$w):void");
    }

    /* renamed from: J3 */
    private final void m101781J3(int i, int i2, boolean z) {
        m101783L3(-1, Integer.MIN_VALUE);
        if (!z) {
            super.mo5201P2(i, i2);
            return;
        }
        int A3 = m101772A3(i);
        if (A3 == -1 || m101808z3(i) != -1) {
            super.mo5201P2(i, i2);
            return;
        }
        int i3 = i - 1;
        if (m101808z3(i3) != -1) {
            super.mo5201P2(i3, i2);
        } else if (this.f83774Q == null || A3 != m101808z3(this.f83775R)) {
            m101783L3(i, i2);
            super.mo5201P2(i, i2);
        } else {
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            View view = this.f83774Q;
            C41536l.m120486f(view);
            super.mo5201P2(i, i2 + view.getHeight());
        }
    }

    /* renamed from: K3 */
    private final void m101782K3(RecyclerView.C1736h hVar) {
        RecyclerView.C1736h hVar2 = this.f83769L;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.f83773P);
        }
        if (hVar instanceof C34655a.C34656a) {
            this.f83769L = hVar;
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f83773P);
            }
            this.f83773P.mo5583a();
            return;
        }
        this.f83769L = null;
        this.f83772O.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public final void m101783L3(int i, int i2) {
        this.f83776S = i;
        this.f83777T = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009c, code lost:
        if (mo5700q0(r12) != r8) goto L_0x009e;
     */
    /* renamed from: M3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101784M3(androidx.recyclerview.widget.RecyclerView.C1759w r11, boolean r12) {
        /*
            r10 = this;
            java.util.List r0 = r10.f83772O
            int r0 = r0.size()
            int r1 = r10.mo5660V()
            if (r0 <= 0) goto L_0x00c7
            if (r1 <= 0) goto L_0x00c7
            r2 = 0
            r3 = r2
        L_0x0010:
            r4 = 0
            r5 = -1
            if (r3 >= r1) goto L_0x0034
            android.view.View r6 = r10.mo5658U(r3)
            kotlin.jvm.internal.C41536l.m120486f(r6)
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            java.lang.String r8 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams"
            kotlin.jvm.internal.C41536l.m120487g(r7, r8)
            androidx.recyclerview.widget.RecyclerView$q r7 = (androidx.recyclerview.widget.RecyclerView.C1752q) r7
            boolean r8 = r10.m101777F3(r6, r7)
            if (r8 == 0) goto L_0x0031
            int r1 = r7.mo5728a()
            goto L_0x0037
        L_0x0031:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0034:
            r6 = r4
            r1 = r5
            r3 = r1
        L_0x0037:
            if (r6 == 0) goto L_0x00c7
            if (r1 == r5) goto L_0x00c7
            int r7 = r10.m101772A3(r1)
            if (r7 == r5) goto L_0x004e
            java.util.List r8 = r10.f83772O
            java.lang.Object r8 = r8.get(r7)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            goto L_0x004f
        L_0x004e:
            r8 = r5
        L_0x004f:
            r9 = 1
            int r7 = r7 + r9
            if (r0 <= r7) goto L_0x0060
            java.util.List r0 = r10.f83772O
            java.lang.Object r0 = r0.get(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0061
        L_0x0060:
            r0 = r5
        L_0x0061:
            if (r8 == r5) goto L_0x00c7
            if (r8 != r1) goto L_0x006b
            boolean r6 = r10.m101776E3(r6)
            if (r6 == 0) goto L_0x00c7
        L_0x006b:
            int r6 = r8 + 1
            if (r0 == r6) goto L_0x00c7
            android.view.View r6 = r10.f83774Q
            if (r6 == 0) goto L_0x008a
            androidx.recyclerview.widget.RecyclerView$h r7 = r10.f83769L
            if (r7 == 0) goto L_0x0085
            kotlin.jvm.internal.C41536l.m120486f(r6)
            int r6 = r10.mo5689l0(r6)
            int r7 = r7.getItemViewType(r8)
            if (r6 != r7) goto L_0x0085
            r2 = r9
        L_0x0085:
            if (r2 != 0) goto L_0x008a
            r10.m101780I3(r11)
        L_0x008a:
            android.view.View r2 = r10.f83774Q
            if (r2 != 0) goto L_0x0091
            r10.m101807y3(r11, r8)
        L_0x0091:
            if (r12 != 0) goto L_0x009e
            android.view.View r12 = r10.f83774Q
            kotlin.jvm.internal.C41536l.m120486f(r12)
            int r12 = r10.mo5700q0(r12)
            if (r12 == r8) goto L_0x00a6
        L_0x009e:
            android.view.View r12 = r10.f83774Q
            kotlin.jvm.internal.C41536l.m120486f(r12)
            r10.m101806x3(r11, r12, r8)
        L_0x00a6:
            android.view.View r11 = r10.f83774Q
            if (r11 == 0) goto L_0x00c6
            if (r0 == r5) goto L_0x00b8
            int r0 = r0 - r1
            int r3 = r3 + r0
            android.view.View r12 = r10.mo5658U(r3)
            android.view.View r0 = r10.f83774Q
            if (r12 != r0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r4 = r12
        L_0x00b8:
            float r12 = r10.m101774C3(r11, r4)
            r11.setTranslationX(r12)
            float r12 = r10.m101775D3(r11, r4)
            r11.setTranslationY(r12)
        L_0x00c6:
            return
        L_0x00c7:
            android.view.View r12 = r10.f83774Q
            if (r12 == 0) goto L_0x00ce
            r10.m101780I3(r11)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager.m101784M3(androidx.recyclerview.widget.RecyclerView$w, boolean):void");
    }

    /* renamed from: x3 */
    private final void m101806x3(RecyclerView.C1759w wVar, View view, int i) {
        wVar.mo5771c(view, i);
        this.f83775R = i;
        m101778G3(view);
        if (this.f83776S != -1) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C34659c(view, this));
        }
    }

    /* renamed from: y3 */
    private final void m101807y3(RecyclerView.C1759w wVar, int i) {
        C34655a.C34656a aVar;
        View p = wVar.mo5784p(i);
        C41536l.m120488h(p, "recycler.getViewForPosition(position)");
        RecyclerView.C1736h hVar = this.f83769L;
        if (hVar instanceof C34655a.C34656a) {
            aVar = (C34655a.C34656a) hVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.mo84616d(p);
        }
        mo5694n(p);
        m101778G3(p);
        mo5620A0(p);
        this.f83774Q = p;
        this.f83775R = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public final int m101808z3(int i) {
        int size = this.f83772O.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (((Number) this.f83772O.get(i3)).intValue() > i) {
                size = i3 - 1;
            } else if (((Number) this.f83772O.get(i3)).intValue() >= i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: B */
    public int mo5190B(RecyclerView.C1726b0 b0Var) {
        C41536l.m120489i(b0Var, "state");
        return ((Number) m101779H3(new C34660d(this, b0Var))).intValue();
    }

    /* renamed from: C */
    public int mo5146C(RecyclerView.C1726b0 b0Var) {
        C41536l.m120489i(b0Var, "state");
        return ((Number) m101779H3(new C34661e(this, b0Var))).intValue();
    }

    /* renamed from: D */
    public int mo5147D(RecyclerView.C1726b0 b0Var) {
        C41536l.m120489i(b0Var, "state");
        return ((Number) m101779H3(new C34662f(this, b0Var))).intValue();
    }

    /* renamed from: E */
    public int mo5195E(RecyclerView.C1726b0 b0Var) {
        C41536l.m120489i(b0Var, "state");
        return ((Number) m101779H3(new C34664h(this, b0Var))).intValue();
    }

    /* renamed from: F */
    public int mo5148F(RecyclerView.C1726b0 b0Var) {
        C41536l.m120489i(b0Var, "state");
        return ((Number) m101779H3(new C34665i(this, b0Var))).intValue();
    }

    /* renamed from: G */
    public int mo5150G(RecyclerView.C1726b0 b0Var) {
        C41536l.m120489i(b0Var, "state");
        return ((Number) m101779H3(new C34666j(this, b0Var))).intValue();
    }

    /* renamed from: I1 */
    public int mo5152I1(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        C41536l.m120489i(wVar, "recycler");
        int intValue = ((Number) m101779H3(new C34669m(this, i, wVar, b0Var))).intValue();
        if (intValue != 0) {
            m101784M3(wVar, false);
        }
        return intValue;
    }

    /* renamed from: J1 */
    public void mo5197J1(int i) {
        mo5201P2(i, Integer.MIN_VALUE);
    }

    /* renamed from: K1 */
    public int mo5153K1(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        C41536l.m120489i(wVar, "recycler");
        int intValue = ((Number) m101779H3(new C34670n(this, i, wVar, b0Var))).intValue();
        if (intValue != 0) {
            m101784M3(wVar, false);
        }
        return intValue;
    }

    /* renamed from: P0 */
    public void mo5649P0(RecyclerView.C1736h hVar, RecyclerView.C1736h hVar2) {
        super.mo5649P0(hVar, hVar2);
        m101782K3(hVar2);
    }

    /* renamed from: P2 */
    public void mo5201P2(int i, int i2) {
        m101781J3(i, i2, true);
    }

    /* renamed from: R0 */
    public void mo5652R0(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.mo5652R0(recyclerView);
        m101782K3(recyclerView.getAdapter());
    }

    /* renamed from: U0 */
    public View mo5159U0(View view, int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        C41536l.m120489i(view, "focused");
        C41536l.m120489i(wVar, "recycler");
        C41536l.m120489i(b0Var, "state");
        return (View) m101779H3(new C34667k(this, view, i, wVar, b0Var));
    }

    /* renamed from: a */
    public PointF mo5209a(int i) {
        return (PointF) m101779H3(new C34663g(this, i));
    }

    /* renamed from: i1 */
    public void mo5170i1(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        C41536l.m120489i(wVar, "recycler");
        C41536l.m120489i(b0Var, "state");
        m101779H3(new C34668l(this, wVar, b0Var));
        if (!b0Var.mo5464e()) {
            m101784M3(wVar, true);
        }
    }

    /* renamed from: n1 */
    public void mo5218n1(Parcelable parcelable) {
        SavedState savedState;
        if (parcelable instanceof SavedState) {
            savedState = (SavedState) parcelable;
        } else {
            savedState = null;
        }
        if (savedState != null) {
            this.f83776S = savedState.mo84604b();
            this.f83777T = savedState.mo84603a();
            super.mo5218n1(savedState.mo84605d());
        }
    }

    /* renamed from: o1 */
    public Parcelable mo5220o1() {
        return new SavedState(super.mo5220o1(), this.f83776S, this.f83777T);
    }

    public StickyHeaderLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        this.f83772O = new ArrayList();
        this.f83773P = new C34658b();
        this.f83775R = -1;
        this.f83776S = -1;
    }
}
