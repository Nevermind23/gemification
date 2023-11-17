package p464ij;

import android.view.View;
import p341ge.bog.designsystem.components.search.SearchView;
import p352ak.C9881b5;

/* renamed from: ij.c */
public final /* synthetic */ class C15659c implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ SearchView f44472d;

    /* renamed from: e */
    public final /* synthetic */ C9881b5 f44473e;

    public /* synthetic */ C15659c(SearchView searchView, C9881b5 b5Var) {
        this.f44472d = searchView;
        this.f44473e = b5Var;
    }

    public final void onFocusChange(View view, boolean z) {
        SearchView.m50653g(this.f44472d, this.f44473e, view, z);
    }
}
