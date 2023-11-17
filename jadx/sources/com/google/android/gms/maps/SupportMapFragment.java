package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p182n6.C7264i;
import p196o7.C7476e;

public class SupportMapFragment extends Fragment {

    /* renamed from: d */
    private final C4554e f14028d = new C4554e(this);

    /* renamed from: h1 */
    public void mo14063h1(C7476e eVar) {
        C7264i.m27897f("getMapAsync must be called on the main thread.");
        C7264i.m27903l(eVar, "callback must not be null.");
        this.f14028d.mo14082w(eVar);
    }

    public void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        C4554e.m17440v(this.f14028d, activity);
    }

    public void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onCreate(bundle);
            this.f14028d.mo24281d(bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View e = this.f14028d.mo24282e(layoutInflater, viewGroup, bundle);
        e.setClickable(true);
        return e;
    }

    public void onDestroy() {
        this.f14028d.mo24283f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f14028d.mo24284g();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            C4554e.m17440v(this.f14028d, activity);
            GoogleMapOptions f0 = GoogleMapOptions.m17396f0(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", f0);
            this.f14028d.mo24285h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f14028d.mo24286i();
        super.onLowMemory();
    }

    public void onPause() {
        this.f14028d.mo24287j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f14028d.mo24288k();
    }

    public void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f14028d.mo24289l(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f14028d.mo24290m();
    }

    public void onStop() {
        this.f14028d.mo24291n();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
