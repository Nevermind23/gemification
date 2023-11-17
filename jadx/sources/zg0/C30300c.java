package zg0;

import android.view.View;
import p341ge.bog.mobilebank.galtandtaggart.domain.model.WatchList;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.C24015a;

/* renamed from: zg0.c */
public final /* synthetic */ class C30300c implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C24015a f76213d;

    /* renamed from: e */
    public final /* synthetic */ WatchList f76214e;

    public /* synthetic */ C30300c(C24015a aVar, WatchList watchList) {
        this.f76213d = aVar;
        this.f76214e = watchList;
    }

    public final boolean onLongClick(View view) {
        return C24015a.C24017b.m77483n(this.f76213d, this.f76214e, view);
    }
}
