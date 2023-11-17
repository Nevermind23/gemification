package p642vh;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.view.C0267d;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p352ak.C9899e;
import p352ak.C9907f;
import p352ak.C9915g;
import p601sg.C17786k;

/* renamed from: vh.b0 */
public abstract class C18338b0 {

    /* renamed from: c */
    public static final C18340b f51787c = new C18340b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C18347f f51788a;

    /* renamed from: b */
    private final C18339a f51789b;

    /* renamed from: vh.b0$a */
    public interface C18339a {
        /* renamed from: a */
        int mo46119a(int i, int i2);

        /* renamed from: b */
        int mo46120b(int i);
    }

    /* renamed from: vh.b0$b */
    public static final class C18340b {
        private C18340b() {
        }

        public /* synthetic */ C18340b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C18338b0 m62692b(C18340b bVar, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i2 = C17786k.f49830h;
            }
            if ((i3 & 4) != 0) {
                z = true;
            }
            if ((i3 & 8) != 0) {
                z2 = false;
            }
            return bVar.mo46121a(i, i2, z, z2);
        }

        /* renamed from: a */
        public final C18338b0 mo46121a(int i, int i2, boolean z, boolean z2) {
            if (i >= 5 && z) {
                return new C18342d(i2);
            }
            if (i >= 1) {
                return new C18341c(i2, z2);
            }
            return C18346e.f51796d;
        }
    }

    /* renamed from: vh.b0$d */
    public static final class C18342d extends C18338b0 {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C18343a f51792g = new C18343a((DefaultConstructorMarker) null);

        /* renamed from: d */
        private final int f51793d;

        /* renamed from: e */
        private final C18347f f51794e = new C18345c();

        /* renamed from: f */
        private final C18339a f51795f = new C18344b();

        /* renamed from: vh.b0$d$a */
        private static final class C18343a {
            private C18343a() {
            }

            public /* synthetic */ C18343a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final int mo46122a(int i) {
                int i2;
                if (i <= 0 || (i2 = 1073741823 % i) == 0) {
                    return 1073741823;
                }
                return 1073741823 - i2;
            }
        }

        /* renamed from: vh.b0$d$b */
        public static final class C18344b implements C18339a {
            C18344b() {
            }

            /* renamed from: a */
            public int mo46119a(int i, int i2) {
                return i2 % i;
            }

            /* renamed from: b */
            public int mo46120b(int i) {
                return Integer.MAX_VALUE;
            }
        }

        /* renamed from: vh.b0$d$c */
        public static final class C18345c implements C18347f {
            C18345c() {
            }

            /* renamed from: a */
            public int mo46123a(int i) {
                return C18342d.f51792g.mo46122a(i);
            }

            /* renamed from: b */
            public int mo46124b(int i, int i2) {
                return mo46123a(i) + i2;
            }
        }

        public C18342d(int i) {
            super((DefaultConstructorMarker) null);
            this.f51793d = i;
        }

        /* renamed from: a */
        public C18338b0 mo46116a(ViewPager2 viewPager2, ViewGroup viewGroup) {
            C41536l.m120489i(viewPager2, "viewPager");
            C41536l.m120489i(viewGroup, "sliderContainer");
            viewGroup.removeAllViews();
            C9907f.m36340d(LayoutInflater.from(new C0267d(viewPager2.getContext(), this.f51793d)), viewGroup, true).mo3946b().mo36716h(viewPager2);
            return this;
        }

        /* renamed from: b */
        public C18339a mo46117b() {
            return this.f51795f;
        }

        /* renamed from: c */
        public C18347f mo46118c() {
            return this.f51794e;
        }
    }

    /* renamed from: vh.b0$e */
    public static final class C18346e extends C18338b0 {

        /* renamed from: d */
        public static final C18346e f51796d = new C18346e();

        private C18346e() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public C18338b0 mo46116a(ViewPager2 viewPager2, ViewGroup viewGroup) {
            C41536l.m120489i(viewPager2, "viewPager");
            C41536l.m120489i(viewGroup, "sliderContainer");
            viewGroup.removeAllViews();
            return this;
        }
    }

    /* renamed from: vh.b0$f */
    public interface C18347f {
        /* renamed from: a */
        int mo46123a(int i);

        /* renamed from: b */
        int mo46124b(int i, int i2);
    }

    /* renamed from: vh.b0$g */
    public static final class C18348g implements C18339a {
        C18348g() {
        }

        /* renamed from: a */
        public int mo46119a(int i, int i2) {
            return i2 % i;
        }

        /* renamed from: b */
        public int mo46120b(int i) {
            return i;
        }
    }

    /* renamed from: vh.b0$h */
    public static final class C18349h implements C18347f {
        C18349h() {
        }

        /* renamed from: a */
        public int mo46123a(int i) {
            return 0;
        }

        /* renamed from: b */
        public int mo46124b(int i, int i2) {
            return mo46123a(i) + i2;
        }
    }

    public /* synthetic */ C18338b0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract C18338b0 mo46116a(ViewPager2 viewPager2, ViewGroup viewGroup);

    /* renamed from: b */
    public C18339a mo46117b() {
        return this.f51789b;
    }

    /* renamed from: c */
    public C18347f mo46118c() {
        return this.f51788a;
    }

    /* renamed from: vh.b0$c */
    public static final class C18341c extends C18338b0 {

        /* renamed from: d */
        private final int f51790d;

        /* renamed from: e */
        private final boolean f51791e;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18341c(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? C17786k.f49830h : i, (i2 & 2) != 0 ? false : z);
        }

        /* renamed from: a */
        public C18338b0 mo46116a(ViewPager2 viewPager2, ViewGroup viewGroup) {
            C41536l.m120489i(viewPager2, "viewPager");
            C41536l.m120489i(viewGroup, "sliderContainer");
            viewGroup.removeAllViews();
            if (this.f51791e) {
                C9915g.m36370d(LayoutInflater.from(new C0267d(viewPager2.getContext(), this.f51790d)), viewGroup, true).mo3946b().mo97843c(viewPager2);
            } else {
                C9899e.m36310d(LayoutInflater.from(new C0267d(viewPager2.getContext(), this.f51790d)), viewGroup, true).mo3946b().setViewPager2(viewPager2);
            }
            return this;
        }

        public C18341c(int i, boolean z) {
            super((DefaultConstructorMarker) null);
            this.f51790d = i;
            this.f51791e = z;
        }
    }

    private C18338b0() {
        this.f51788a = new C18349h();
        this.f51789b = new C18348g();
    }
}
