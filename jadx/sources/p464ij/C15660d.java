package p464ij;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.TextView;
import p341ge.bog.designsystem.components.search.SearchView;
import p352ak.C9881b5;

/* renamed from: ij.d */
public final /* synthetic */ class C15660d implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C9881b5 f44474a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f44475b;

    /* renamed from: c */
    public final /* synthetic */ Context f44476c;

    public /* synthetic */ C15660d(C9881b5 b5Var, SearchView searchView, Context context) {
        this.f44474a = b5Var;
        this.f44475b = searchView;
        this.f44476c = context;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return SearchView.m50654h(this.f44474a, this.f44475b, this.f44476c, textView, i, keyEvent);
    }
}
