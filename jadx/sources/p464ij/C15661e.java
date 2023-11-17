package p464ij;

import android.content.Context;
import android.view.View;
import p341ge.bog.designsystem.components.search.SearchView;
import p352ak.C9881b5;

/* renamed from: ij.e */
public final /* synthetic */ class C15661e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SearchView f44477d;

    /* renamed from: e */
    public final /* synthetic */ C9881b5 f44478e;

    /* renamed from: f */
    public final /* synthetic */ Context f44479f;

    public /* synthetic */ C15661e(SearchView searchView, C9881b5 b5Var, Context context) {
        this.f44477d = searchView;
        this.f44478e = b5Var;
        this.f44479f = context;
    }

    public final void onClick(View view) {
        SearchView.m50655i(this.f44477d, this.f44478e, this.f44479f, view);
    }
}
