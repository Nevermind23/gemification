package p341ge.bog.mobilebank.stories.presentation.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import c61.C31277b;
import com.github.mikephil.charting.utils.Utils;
import g91.C32303f;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l61.C37083f;
import m41.C37224b;
import m61.C37229a;
import m61.C37230b;
import m61.C37231c;
import m61.C37232d;
import o31.C37588a0;
import o61.C37661c;
import org.parceler.C42035e;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.shared.presentation.common.model.UrlDataUiModel;
import p341ge.bog.mobilebank.shared.presentation.common.model.UrlParamUiModel;
import p341ge.bog.mobilebank.stories.presentation.customview.PageIndicatorView;
import p341ge.bog.mobilebank.stories.presentation.model.StoryContentLinkUiModel;
import p341ge.bog.mobilebank.stories.presentation.model.StoryDetailsUiModel;
import p341ge.bog.mobilebank.stories.presentation.model.StoryGroupUiModel;
import p61.C37918g;
import p61.C37919h;
import p61.C37920i;
import p61.C37922k;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment */
public final class StoryGroupFragment extends C34831a {

    /* renamed from: l */
    public static final C34808a f84063l = new C34808a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C31277b f84064g;

    /* renamed from: h */
    public C37918g f84065h;

    /* renamed from: i */
    private final C41217g f84066i = C41219i.m119470b(new C34815h(this));

    /* renamed from: j */
    private final C41217g f84067j;

    /* renamed from: k */
    private final C41217g f84068k;

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$StoryGroupData */
    private static final class StoryGroupData implements Parcelable {
        public static final Parcelable.Creator<StoryGroupData> CREATOR = new C34807a();

        /* renamed from: d */
        private final StoryGroupUiModel f84069d;

        /* renamed from: e */
        private final boolean f84070e;

        /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$StoryGroupData$a */
        public static final class C34807a implements Parcelable.Creator {
            /* renamed from: a */
            public final StoryGroupData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new StoryGroupData(StoryGroupUiModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final StoryGroupData[] newArray(int i) {
                return new StoryGroupData[i];
            }
        }

        public StoryGroupData(StoryGroupUiModel storyGroupUiModel, boolean z) {
            C41536l.m120489i(storyGroupUiModel, "storyGroup");
            this.f84069d = storyGroupUiModel;
            this.f84070e = z;
        }

        /* renamed from: a */
        public final StoryGroupUiModel mo85016a() {
            return this.f84069d;
        }

        /* renamed from: b */
        public final boolean mo85017b() {
            return this.f84070e;
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
            return C41536l.m120484d(this.f84069d, storyGroupData.f84069d) && this.f84070e == storyGroupData.f84070e;
        }

        public int hashCode() {
            int hashCode = this.f84069d.hashCode() * 31;
            boolean z = this.f84070e;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            StoryGroupUiModel storyGroupUiModel = this.f84069d;
            boolean z = this.f84070e;
            return "StoryGroupData(storyGroup=" + storyGroupUiModel + ", isSeenStory=" + z + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            this.f84069d.writeToParcel(parcel, i);
            parcel.writeInt(this.f84070e ? 1 : 0);
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$a */
    public static final class C34808a {
        private C34808a() {
        }

        public /* synthetic */ C34808a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final StoryGroupFragment mo85027a(StoryGroupUiModel storyGroupUiModel, boolean z) {
            C41536l.m120489i(storyGroupUiModel, "storyGroup");
            StoryGroupFragment storyGroupFragment = new StoryGroupFragment();
            storyGroupFragment.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_DATA", new StoryGroupData(storyGroupUiModel, z))));
            return storyGroupFragment;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$b */
    static final class C34809b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StoryGroupFragment f84071d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34809b(StoryGroupFragment storyGroupFragment) {
            super(1);
            this.f84071d = storyGroupFragment;
        }

        /* renamed from: a */
        public final void mo85028a(List list) {
            PageIndicatorView pageIndicatorView = this.f84071d.m102279z1().f77665i;
            C41536l.m120488h(list, "it");
            pageIndicatorView.setData(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85028a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$c */
    static final class C34810c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StoryGroupFragment f84072d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34810c(StoryGroupFragment storyGroupFragment) {
            super(1);
            this.f84072d = storyGroupFragment;
        }

        /* renamed from: a */
        public final void mo85029a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f84072d.m102261L1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85029a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$d */
    /* synthetic */ class C34811d extends C41535k implements C43075l {
        C34811d(Object obj) {
            super(1, obj, StoryGroupFragment.class, "setPagerData", "setPagerData(Lge/bog/mobilebank/stories/presentation/model/StoryPagerData;)V", 0);
        }

        /* renamed from: b */
        public final void mo85030b(C37661c cVar) {
            C41536l.m120489i(cVar, "p0");
            ((StoryGroupFragment) this.receiver).m102259J1(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85030b((C37661c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$e */
    /* synthetic */ class C34812e extends C41535k implements C43075l {
        C34812e(Object obj) {
            super(1, obj, StoryGroupFragment.class, "openContentLink", "openContentLink(Lge/bog/mobilebank/stories/presentation/model/StoryContentLinkUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo85031b(StoryContentLinkUiModel storyContentLinkUiModel) {
            C41536l.m120489i(storyContentLinkUiModel, "p0");
            ((StoryGroupFragment) this.receiver).m102257G1(storyContentLinkUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85031b((StoryContentLinkUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$f */
    static final class C34813f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StoryGroupFragment f84073d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34813f(StoryGroupFragment storyGroupFragment) {
            super(1);
            this.f84073d = storyGroupFragment;
        }

        /* renamed from: a */
        public final void mo85032a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f84073d.m102278y1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85032a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$g */
    static final class C34814g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StoryGroupFragment f84074d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34814g(StoryGroupFragment storyGroupFragment) {
            super(1);
            this.f84074d = storyGroupFragment;
        }

        /* renamed from: a */
        public final void mo85033a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f84074d.m102262M1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85033a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$h */
    static final class C34815h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StoryGroupFragment f84075d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34815h(StoryGroupFragment storyGroupFragment) {
            super(0);
            this.f84075d = storyGroupFragment;
        }

        /* renamed from: b */
        public final StoryGroupData invoke() {
            Bundle arguments = this.f84075d.getArguments();
            StoryGroupData storyGroupData = arguments != null ? (StoryGroupData) arguments.getParcelable("ARG_DATA") : null;
            C41536l.m120486f(storyGroupData);
            return storyGroupData;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$i */
    static final class C34816i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StoryGroupFragment f84076d;

        /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$i$a */
        /* synthetic */ class C34817a implements C37230b, C41532h {

            /* renamed from: a */
            final /* synthetic */ C37919h f84077a;

            C34817a(C37919h hVar) {
                this.f84077a = hVar;
            }

            /* renamed from: a */
            public final void mo85036a(StoryDetailsUiModel storyDetailsUiModel) {
                C41536l.m120489i(storyDetailsUiModel, "p0");
                this.f84077a.mo91264cr(storyDetailsUiModel);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C37230b) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f84077a, C37919h.class, "onNextStoryClicked", "onNextStoryClicked(Lge/bog/mobilebank/stories/presentation/model/StoryDetailsUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$i$b */
        /* synthetic */ class C34818b implements C37230b, C41532h {

            /* renamed from: a */
            final /* synthetic */ C37919h f84078a;

            C34818b(C37919h hVar) {
                this.f84078a = hVar;
            }

            /* renamed from: a */
            public final void mo85036a(StoryDetailsUiModel storyDetailsUiModel) {
                C41536l.m120489i(storyDetailsUiModel, "p0");
                this.f84078a.mo91269yl(storyDetailsUiModel);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C37230b) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f84078a, C37919h.class, "onPreviousStoryClicked", "onPreviousStoryClicked(Lge/bog/mobilebank/stories/presentation/model/StoryDetailsUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$i$c */
        /* synthetic */ class C34819c implements C37229a, C41532h {

            /* renamed from: a */
            final /* synthetic */ StoryGroupFragment f84079a;

            C34819c(StoryGroupFragment storyGroupFragment) {
                this.f84079a = storyGroupFragment;
            }

            /* renamed from: a */
            public final void mo85041a(StoryDetailsUiModel storyDetailsUiModel) {
                C41536l.m120489i(storyDetailsUiModel, "p0");
                this.f84079a.m102256E1(storyDetailsUiModel);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C37229a) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f84079a, StoryGroupFragment.class, "onActionClicked", "onActionClicked(Lge/bog/mobilebank/stories/presentation/model/StoryDetailsUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$i$d */
        /* synthetic */ class C34820d implements C37231c, C41532h {

            /* renamed from: a */
            final /* synthetic */ C37919h f84080a;

            C34820d(C37919h hVar) {
                this.f84080a = hVar;
            }

            /* renamed from: a */
            public final void mo85044a(StoryDetailsUiModel storyDetailsUiModel) {
                C41536l.m120489i(storyDetailsUiModel, "p0");
                this.f84080a.mo91267tu(storyDetailsUiModel);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C37231c) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f84080a, C37919h.class, "onStoryPaused", "onStoryPaused(Lge/bog/mobilebank/stories/presentation/model/StoryDetailsUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$i$e */
        /* synthetic */ class C34821e implements C37231c, C41532h {

            /* renamed from: a */
            final /* synthetic */ C37919h f84081a;

            C34821e(C37919h hVar) {
                this.f84081a = hVar;
            }

            /* renamed from: a */
            public final void mo85044a(StoryDetailsUiModel storyDetailsUiModel) {
                C41536l.m120489i(storyDetailsUiModel, "p0");
                this.f84081a.mo91261Li(storyDetailsUiModel);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C37231c) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f84081a, C37919h.class, "onStoryResumed", "onStoryResumed(Lge/bog/mobilebank/stories/presentation/model/StoryDetailsUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$i$f */
        /* synthetic */ class C34822f implements C37232d, C41532h {

            /* renamed from: a */
            final /* synthetic */ C37919h f84082a;

            C34822f(C37919h hVar) {
                this.f84082a = hVar;
            }

            /* renamed from: a */
            public final void mo85049a(StoryDetailsUiModel storyDetailsUiModel) {
                C41536l.m120489i(storyDetailsUiModel, "p0");
                this.f84082a.mo91268un(storyDetailsUiModel);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C37232d) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f84082a, C37919h.class, "onStoryViewed", "onStoryViewed(Lge/bog/mobilebank/stories/presentation/model/StoryDetailsUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34816i(StoryGroupFragment storyGroupFragment) {
            super(0);
            this.f84076d = storyGroupFragment;
        }

        /* renamed from: b */
        public final C37083f invoke() {
            return new C37083f(new C34817a(this.f84076d.m102255D1().mo91277jw()), new C34818b(this.f84076d.m102255D1().mo91277jw()), new C34819c(this.f84076d), new C34820d(this.f84076d.m102255D1().mo91277jw()), new C34821e(this.f84076d.m102255D1().mo91277jw()), new C34822f(this.f84076d.m102255D1().mo91277jw()));
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$j */
    static final class C34823j implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f84083a;

        C34823j(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f84083a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f84083a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f84083a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$k */
    public static final class C34824k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84084d;

        /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$k$a */
        public static final class C34825a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C43064a f84085d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C34825a(C43064a aVar) {
                super(0);
                this.f84085d = aVar;
            }

            /* renamed from: b */
            public final C1613n0 invoke() {
                return (C1613n0) this.f84085d.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34824k(C43064a aVar) {
            super(0);
            this.f84084d = aVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C34825a(this.f84084d));
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$l */
    public static final class C34826l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84086d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34826l(Fragment fragment) {
            super(0);
            this.f84086d = fragment;
        }

        public final Fragment invoke() {
            return this.f84086d;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$m */
    public static final class C34827m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84087d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34827m(C43064a aVar) {
            super(0);
            this.f84087d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f84087d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$n */
    public static final class C34828n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f84088d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34828n(C41217g gVar) {
            super(0);
            this.f84088d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f84088d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$o */
    public static final class C34829o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84089d;

        /* renamed from: e */
        final /* synthetic */ C41217g f84090e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34829o(C43064a aVar, C41217g gVar) {
            super(0);
            this.f84089d = aVar;
            this.f84090e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f84089d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f84090e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment$p */
    static final class C34830p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ StoryGroupFragment f84091d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34830p(StoryGroupFragment storyGroupFragment) {
            super(0);
            this.f84091d = storyGroupFragment;
        }

        /* renamed from: b */
        public final C37922k invoke() {
            return this.f84091d.mo85013C1().mo32818a(this.f84091d.m102253A1().mo85016a(), this.f84091d.m102253A1().mo85017b(), this.f84091d.m102277x1());
        }
    }

    public StoryGroupFragment() {
        C37588a0 a0Var = C37588a0.f90326a;
        C34824k kVar = new C34824k(new C34830p(this));
        C41217g a = C41219i.m119469a(C41222k.NONE, new C34827m(new C34826l(this)));
        this.f84067j = C1514j0.m5374c(this, C41520a0.m120436b(C37922k.class), new C34828n(a), new C34829o((C43064a) null, a), kVar);
        this.f84068k = C41219i.m119470b(new C34816i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final StoryGroupData m102253A1() {
        return (StoryGroupData) this.f84066i.getValue();
    }

    /* renamed from: B1 */
    private final C37083f m102254B1() {
        return (C37083f) this.f84068k.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public final C37922k m102255D1() {
        return (C37922k) this.f84067j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public final void m102256E1(StoryDetailsUiModel storyDetailsUiModel) {
        m102255D1().mo91277jw().mo91260Dd(storyDetailsUiModel);
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public final void m102257G1(StoryContentLinkUiModel storyContentLinkUiModel) {
        if (storyContentLinkUiModel instanceof StoryContentLinkUiModel.DeepLink) {
            m102258H1(((StoryContentLinkUiModel.DeepLink) storyContentLinkUiModel).mo85057a());
        } else if (storyContentLinkUiModel instanceof StoryContentLinkUiModel.Url) {
            C32303f.m95184D(((StoryContentLinkUiModel.Url) storyContentLinkUiModel).mo85067a(), requireContext());
        }
    }

    /* renamed from: H1 */
    private final void m102258H1(UrlDataUiModel urlDataUiModel) {
        C35388f2 f2Var;
        C1505h requireActivity = requireActivity();
        if (requireActivity instanceof C35388f2) {
            f2Var = (C35388f2) requireActivity;
        } else {
            f2Var = null;
        }
        if (f2Var != null) {
            Intent intent = new Intent("PUSH_NOTIF_INTENT");
            intent.putExtra("PUSH_NOTIFS_OPEN", true);
            intent.putExtra("type", urlDataUiModel.mo84577b());
            List<UrlParamUiModel> a = urlDataUiModel.mo84576a();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
            for (UrlParamUiModel urlParamUiModel : a) {
                arrayList.add(new KeyValue(urlParamUiModel.mo84587a(), urlParamUiModel.mo84588b()));
            }
            intent.putExtra("parameters", C42035e.m122121c(arrayList));
            C35388f2.m105048S1(f2Var, intent, false, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public final void m102259J1(C37661c cVar) {
        m102279z1().f77666j.mo6606l(cVar.mo90845a(), false);
    }

    /* renamed from: K1 */
    private final void m102260K1() {
        m102279z1().f77666j.setAdapter(m102254B1());
        m102254B1().mo90018i(m102253A1().mo85016a().mo85098b());
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public final void m102261L1() {
        C1533o.m5445b(this, "REQUEST_KEY_CURRENT_STORY_GROUP_FINISHED", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CURRENT_STORY_GROUP_FINISHED", Boolean.TRUE)));
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public final void m102262M1() {
        C1533o.m5445b(this, "REQUEST_KEY_STORY_GO_TO_PREVIOUS_GROUP", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_STORY_GO_TO_PREVIOUS_GROUP", Boolean.TRUE)));
    }

    /* renamed from: t1 */
    private final void m102274t1() {
        m102279z1().f77661e.setOnClickListener(new C34832b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m102275u1(StoryGroupFragment storyGroupFragment, View view) {
        C41536l.m120489i(storyGroupFragment, "this$0");
        storyGroupFragment.m102255D1().mo91277jw().mo91263Ru();
    }

    /* renamed from: v1 */
    private final void m102276v1() {
        C37920i kw = m102255D1().mo91278kw();
        kw.mo91272Ls().mo4819k(getViewLifecycleOwner(), new C34823j(new C34809b(this)));
        LiveData zg = kw.mo91275zg();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(zg, viewLifecycleOwner, new C34810c(this));
        kw.mo91271L8().mo4819k(getViewLifecycleOwner(), new C34823j(new C34811d(this)));
        LiveData ea = kw.mo91274ea();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(ea, viewLifecycleOwner2, new C34812e(this));
        LiveData di = kw.mo91273di();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(di, viewLifecycleOwner3, new C34813f(this));
        LiveData Gf = kw.mo91270Gf();
        C1619q viewLifecycleOwner4 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner4, "viewLifecycleOwner");
        C37224b.m109963b(Gf, viewLifecycleOwner4, new C34814g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final boolean m102277x1() {
        boolean z;
        boolean z2;
        if (Settings.System.getFloat(requireContext().getContentResolver(), "transition_animation_scale", Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (Settings.System.getFloat(requireContext().getContentResolver(), "window_animation_scale", Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final void m102278y1() {
        C1533o.m5445b(this, "REQUEST_KEY_STORY_SWIPED_DOWN", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_STORY_SWIPED_DOWN", Boolean.TRUE)));
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public final C31277b m102279z1() {
        C31277b bVar = this.f84064g;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: C1 */
    public final C37918g mo85013C1() {
        C37918g gVar = this.f84065h;
        if (gVar != null) {
            return gVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: F1 */
    public final void mo85014F1() {
        m102255D1().mo91277jw().mo91263Ru();
    }

    /* renamed from: I1 */
    public final void mo85015I1(boolean z) {
        m102255D1().mo91277jw().mo91266rh(z);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C31277b d = C31277b.m92899d(layoutInflater, viewGroup, false);
        this.f84064g = d;
        LayerView c = d.mo3946b();
        C41536l.m120488h(c, "inflate(inflater, contai…        it.root\n        }");
        return c;
    }

    public void onPause() {
        super.onPause();
        m102255D1().mo91277jw().mo91262N();
    }

    public void onResume() {
        super.onResume();
        m102255D1().mo91277jw().mo91265n();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m102260K1();
        m102276v1();
        m102274t1();
    }
}
