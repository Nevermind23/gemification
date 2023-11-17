package p341ge.bog.mobilebank.stories.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.core.view.C1259w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.viewpager2.widget.ViewPager2;
import b41.C31128a;
import b41.C31132b;
import c61.C31276a;
import g91.C32286a1;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l61.C37087g;
import m41.C37224b;
import o31.C37613p;
import o61.C37659a;
import p163m0.C7047a;
import p341ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment;
import p61.C37910a;
import p61.C37912c;
import p61.C37915f;
import ue1.C43064a;
import ue1.C43075l;
import x51.C39789a;
import x51.C39790b;

/* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity */
public final class StoryGroupActivity extends C34798a {

    /* renamed from: L */
    public static final C34782a f84032L = new C34782a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C37910a f84033G;

    /* renamed from: H */
    private final C41217g f84034H = C41219i.m119470b(new C34786e(this));

    /* renamed from: I */
    private final C41217g f84035I = new C1617p0(C41520a0.m120436b(C37915f.class), new C34794m(this), new C34796o(this), new C34795n((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f84036J = C41219i.m119470b(new C34783b(this));

    /* renamed from: K */
    private final C41217g f84037K = C41219i.m119470b(new C34787f(this));

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$StoryGroupData */
    private static final class StoryGroupData implements Parcelable {
        public static final Parcelable.Creator<StoryGroupData> CREATOR = new C34781a();

        /* renamed from: d */
        private final Long f84038d;

        /* renamed from: e */
        private final boolean f84039e;

        /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$StoryGroupData$a */
        public static final class C34781a implements Parcelable.Creator {
            /* renamed from: a */
            public final StoryGroupData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new StoryGroupData(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final StoryGroupData[] newArray(int i) {
                return new StoryGroupData[i];
            }
        }

        public StoryGroupData() {
            this((Long) null, false, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public final Long mo84985a() {
            return this.f84038d;
        }

        /* renamed from: b */
        public final boolean mo84986b() {
            return this.f84039e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StoryGroupData)) {
                return false;
            }
            StoryGroupData storyGroupData = (StoryGroupData) obj;
            return C41536l.m120484d(this.f84038d, storyGroupData.f84038d) && this.f84039e == storyGroupData.f84039e;
        }

        public int hashCode() {
            Long l = this.f84038d;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            boolean z = this.f84039e;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            Long l = this.f84038d;
            boolean z = this.f84039e;
            return "StoryGroupData(startingStoryGroupId=" + l + ", isSeenStory=" + z + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            Long l = this.f84038d;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            parcel.writeInt(this.f84039e ? 1 : 0);
        }

        public StoryGroupData(Long l, boolean z) {
            this.f84038d = l;
            this.f84039e = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StoryGroupData(Long l, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? false : z);
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$a */
    public static final class C34782a {
        private C34782a() {
        }

        public /* synthetic */ C34782a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo84996a(Context context, Long l, boolean z) {
            C41536l.m120489i(context, "context");
            context.startActivity(C37613p.m110614a(new Intent(context, StoryGroupActivity.class), C41233s.m119492a("ARG_DATA", new StoryGroupData(l, z))));
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$b */
    static final class C34783b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StoryGroupActivity f84040d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34783b(StoryGroupActivity storyGroupActivity) {
            super(0);
            this.f84040d = storyGroupActivity;
        }

        /* renamed from: b */
        public final C37087g invoke() {
            return new C37087g(this.f84040d);
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$c */
    /* synthetic */ class C34784c extends C41535k implements C43075l {
        C34784c(Object obj) {
            super(1, obj, StoryGroupActivity.class, "onStoryGroupResult", "onStoryGroupResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo84998b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((StoryGroupActivity) this.receiver).m102218Z2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84998b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$d */
    /* synthetic */ class C34785d extends C41535k implements C43075l {
        C34785d(Object obj) {
            super(1, obj, StoryGroupActivity.class, "scrollToPage", "scrollToPage(I)V", 0);
        }

        /* renamed from: b */
        public final void mo84999b(int i) {
            ((StoryGroupActivity) this.receiver).m102220b3(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84999b(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$e */
    static final class C34786e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StoryGroupActivity f84041d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34786e(StoryGroupActivity storyGroupActivity) {
            super(0);
            this.f84041d = storyGroupActivity;
        }

        /* renamed from: b */
        public final C31276a invoke() {
            C31276a d = C31276a.m92894d(this.f84041d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$f */
    static final class C34787f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StoryGroupActivity f84042d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34787f(StoryGroupActivity storyGroupActivity) {
            super(0);
            this.f84042d = storyGroupActivity;
        }

        /* renamed from: b */
        public final C1259w invoke() {
            StoryGroupActivity storyGroupActivity = this.f84042d;
            return new C1259w(storyGroupActivity, storyGroupActivity.m102213U2());
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$g */
    public static final class C34788g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        final /* synthetic */ StoryGroupActivity f84043d;

        C34788g(StoryGroupActivity storyGroupActivity) {
            this.f84043d = storyGroupActivity;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            C41536l.m120489i(motionEvent, "e1");
            C41536l.m120489i(motionEvent2, "e2");
            float y = motionEvent2.getY() - motionEvent.getY();
            if (Math.abs(y) > Math.abs(motionEvent2.getX() - motionEvent.getX())) {
                z = true;
            } else {
                z = false;
            }
            if (!z || Math.abs(y) <= 100.0f || Math.abs(f2) <= 100.0f) {
                return false;
            }
            C41238w wVar = null;
            StoryGroupFragment W2 = StoryGroupActivity.m102215W2(this.f84043d, 0, 1, (Object) null);
            if (W2 != null) {
                W2.mo85014F1();
                wVar = C41238w.f97225a;
            }
            if (wVar == null) {
                this.f84043d.m102209P2();
            }
            return true;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$h */
    static final class C34789h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StoryGroupActivity f84044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34789h(StoryGroupActivity storyGroupActivity) {
            super(1);
            this.f84044d = storyGroupActivity;
        }

        /* renamed from: a */
        public final void mo85003a(C37659a aVar) {
            this.f84044d.m102211R2().f77653e.mo53597e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85003a((C37659a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$i */
    static final class C34790i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StoryGroupActivity f84045d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34790i(StoryGroupActivity storyGroupActivity) {
            super(1);
            this.f84045d = storyGroupActivity;
        }

        /* renamed from: a */
        public final void mo85004a(C37659a aVar) {
            C41536l.m120489i(aVar, "data");
            this.f84045d.m102211R2().f77653e.mo53595c();
            this.f84045d.m102210Q2().mo90021A(aVar.mo90836b(), aVar.mo90837c());
            this.f84045d.m102211R2().f77659k.mo6606l(aVar.mo90835a(), false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85004a((C37659a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$j */
    static final class C34791j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StoryGroupActivity f84046d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34791j(StoryGroupActivity storyGroupActivity) {
            super(1);
            this.f84046d = storyGroupActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f84046d.m102211R2().f77653e.mo53596d();
            this.f84046d.m102211R2().f77654f.setText(C32343x.m95431a0(th, (String) null, 1, (Object) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$k */
    static final class C34792k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f84047a;

        C34792k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f84047a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f84047a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f84047a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$l */
    public static final class C34793l extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ StoryGroupActivity f84048a;

        C34793l(StoryGroupActivity storyGroupActivity) {
            this.f84048a = storyGroupActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m102239b(StoryGroupActivity storyGroupActivity) {
            C41536l.m120489i(storyGroupActivity, "this$0");
            StoryGroupFragment W2 = StoryGroupActivity.m102215W2(storyGroupActivity, 0, 1, (Object) null);
            if (W2 != null) {
                W2.mo85015I1(true);
            }
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            new Handler(Looper.getMainLooper()).postDelayed(new C34804f(this.f84048a), 30);
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$m */
    public static final class C34794m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f84049d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34794m(ComponentActivity componentActivity) {
            super(0);
            this.f84049d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f84049d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$n */
    public static final class C34795n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84050d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f84051e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34795n(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f84050d = aVar;
            this.f84051e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f84050d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f84051e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$o */
    static final class C34796o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StoryGroupActivity f84052d;

        /* renamed from: ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity$o$a */
        static final class C34797a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ StoryGroupActivity f84053d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34797a(StoryGroupActivity storyGroupActivity) {
                super(0);
                this.f84053d = storyGroupActivity;
            }

            /* renamed from: b */
            public final C37915f invoke() {
                StoryGroupData storyGroupData = (StoryGroupData) this.f84053d.getIntent().getParcelableExtra("ARG_DATA");
                if (storyGroupData == null) {
                    storyGroupData = new StoryGroupData((Long) null, false, 3, (DefaultConstructorMarker) null);
                }
                return this.f84053d.mo84984S2().mo32553a(storyGroupData.mo84985a(), storyGroupData.mo84986b());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34796o(StoryGroupActivity storyGroupActivity) {
            super(0);
            this.f84052d = storyGroupActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C34797a(this.f84052d));
        }
    }

    /* renamed from: L2 */
    private final void m102205L2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.mo4367F1("REQUEST_KEY_CURRENT_STORY_GROUP_FINISHED", this, new C34800b(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_STORY_SWIPED_DOWN", this, new C34801c(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_STORY_GO_TO_PREVIOUS_GROUP", this, new C34802d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m102206M2(StoryGroupActivity storyGroupActivity, String str, Bundle bundle) {
        C41536l.m120489i(storyGroupActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_CURRENT_STORY_GROUP_FINISHED", false)) {
            storyGroupActivity.m102217Y2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public static final void m102207N2(StoryGroupActivity storyGroupActivity, String str, Bundle bundle) {
        C41536l.m120489i(storyGroupActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_STORY_SWIPED_DOWN", false)) {
            storyGroupActivity.m102209P2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m102208O2(StoryGroupActivity storyGroupActivity, String str, Bundle bundle) {
        C41536l.m120489i(storyGroupActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_STORY_GO_TO_PREVIOUS_GROUP")) {
            storyGroupActivity.m102219a3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final void m102209P2() {
        finish();
        overridePendingTransition(0, C39789a.story_anim_slide_down);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final C37087g m102210Q2() {
        return (C37087g) this.f84036J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final C31276a m102211R2() {
        return (C31276a) this.f84034H.getValue();
    }

    /* renamed from: T2 */
    private final C1259w m102212T2() {
        return (C1259w) this.f84037K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final GestureDetector.OnGestureListener m102213U2() {
        return new C34788g(this);
    }

    /* renamed from: V2 */
    private final StoryGroupFragment m102214V2(int i) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment k0 = supportFragmentManager.mo4418k0("f" + i);
        if (k0 instanceof StoryGroupFragment) {
            return (StoryGroupFragment) k0;
        }
        return null;
    }

    /* renamed from: W2 */
    static /* synthetic */ StoryGroupFragment m102215W2(StoryGroupActivity storyGroupActivity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = storyGroupActivity.m102211R2().f77659k.getCurrentItem();
        }
        return storyGroupActivity.m102214V2(i);
    }

    /* renamed from: X2 */
    private final C37915f m102216X2() {
        return (C37915f) this.f84035I.getValue();
    }

    /* renamed from: Y2 */
    private final void m102217Y2() {
        if (m102211R2().f77659k.getCurrentItem() == m102210Q2().getItemCount() - 1) {
            finish();
            return;
        }
        ViewPager2 viewPager2 = m102211R2().f77659k;
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final void m102218Z2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C34789h(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C34790i(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C34791j(this), 1, (Object) null);
    }

    /* renamed from: a3 */
    private final void m102219a3() {
        if (m102211R2().f77659k.getCurrentItem() != 0) {
            ViewPager2 viewPager2 = m102211R2().f77659k;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final void m102220b3(int i) {
        m102211R2().f77659k.mo6606l(i, false);
    }

    /* renamed from: c3 */
    private final void m102221c3() {
        m102211R2().f77659k.setAdapter(m102210Q2());
        m102211R2().f77659k.mo6603h(new C34793l(this));
        m102211R2().f77656h.setOnTouchListener(new C34803e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final boolean m102222d3(StoryGroupActivity storyGroupActivity, View view, MotionEvent motionEvent) {
        C41536l.m120489i(storyGroupActivity, "this$0");
        if (storyGroupActivity.m102212T2().mo3731a(motionEvent)) {
            return true;
        }
        return storyGroupActivity.m102211R2().f77659k.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: l1 */
    private final void m102223l1() {
        C37912c iw = m102216X2().mo91255iw();
        iw.mo91252Gp().mo4819k(this, new C34792k(new C34784c(this)));
        C37224b.m109963b(iw.mo91253sj(), this, new C34785d(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        setContentView((View) m102211R2().mo3946b());
        m102221c3();
        getWindow().setStatusBarColor(C0767a.m2893c(this, C39790b.f94494a));
        C32343x.m95444e1(this, true);
        m102205L2();
        m102223l1();
    }

    /* renamed from: S2 */
    public final C37910a mo84984S2() {
        C37910a aVar = this.f84033G;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m102216X2().mo91254hw().mo91251ll();
    }
}
