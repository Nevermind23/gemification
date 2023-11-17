package p341ge.bog.mobilebank.p975ui.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1620q0;
import hd1.C41204a;
import hd1.C41205b;
import java.util.ArrayList;
import jg1.C41438c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.eventbus.EventBusWrapper;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.search.SearchResultType;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p366bk.C10324m;
import p748eu.C20292b;
import p843nw.C26628j;

/* renamed from: ge.bog.mobilebank.ui.fragments.n1 */
public class C35651n1 extends C35656p0 {
    private C41204a compositeDisposable;
    protected EventBusWrapper eventBusWrapper;
    protected C26628j getAccountsWithCardsUseCase;
    public C20292b getAppSettingByNameUseCase;
    protected BankApi mBankApi;
    /* access modifiers changed from: protected */
    public RootBankApiManager mBankApiManager;
    protected Client mClient;
    protected C41438c mEventBus;
    private boolean mIsViewPagerFragment = false;
    public PreferencesApiManager mPreferencesApiManager;
    protected View rootView;

    public C35651n1() {
    }

    /* renamed from: h1 */
    private void m105886h1() {
        if (getActivity() != null) {
            ((C35388f2) getActivity()).mo86429X1(getHeaderText());
        }
    }

    public void addDisposable(C41205b bVar) {
        if (bVar != null) {
            if (this.compositeDisposable == null) {
                this.compositeDisposable = new C41204a();
            }
            this.compositeDisposable.mo95660b(bVar);
        }
    }

    /* access modifiers changed from: protected */
    public <T extends View> T findView(int i, View view) {
        return view.findViewById(i);
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public /* bridge */ /* synthetic */ C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    public String getHeaderText() {
        return null;
    }

    public SearchResultType getSearchType() {
        return null;
    }

    public void handleError(C21503d.C21504a aVar) {
        handleError(aVar.mo53706f());
    }

    public boolean isViewPagerFragment() {
        return this.mIsViewPagerFragment;
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.empty_layout;
    }

    public /* bridge */ /* synthetic */ void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.v("CurrentFragment", getClass().getSimpleName());
        this.mEventBus = this.eventBusWrapper.eventBus;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutId() > 0) {
            this.rootView = layoutInflater.inflate(layoutId(), viewGroup, false);
        } else {
            this.rootView = super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        this.compositeDisposable = new C41204a();
        return this.rootView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        C41204a aVar = this.compositeDisposable;
        if (aVar != null) {
            aVar.dispose();
        }
    }

    public /* bridge */ /* synthetic */ LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == 0) {
                arrayList.add(strArr[i2]);
            } else {
                arrayList2.add(strArr[i2]);
            }
        }
    }

    public void onResume() {
        super.onResume();
        m105886h1();
    }

    public void onStart() {
        super.onStart();
    }

    public void refreshHeaderText(String str) {
        if (getActivity() != null) {
            ((C35388f2) getActivity()).mo86429X1(str);
        }
    }

    public void setViewPagerFragment(boolean z) {
        this.mIsViewPagerFragment = z;
    }

    public void startActivity(Class cls) {
        ((C35388f2) getActivity()).mo86447x2(cls);
    }

    /* access modifiers changed from: protected */
    public <T extends View> T findView(int i) {
        return findView(i, this.rootView);
    }

    public void handleError(Throwable th) {
        if (getActivity() instanceof C35388f2) {
            ((C35388f2) getActivity()).mo74709H1(th);
        }
    }

    public /* bridge */ /* synthetic */ void onAttach(Context context) {
        super.onAttach(context);
    }

    public C35651n1(int i) {
        super(i);
    }
}
