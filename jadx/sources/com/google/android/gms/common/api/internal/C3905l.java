package com.google.android.gms.common.api.internal;

import p337z7.C9219c;
import p337z7.C9227g;
import p337z7.Task;

/* renamed from: com.google.android.gms.common.api.internal.l */
final class C3905l implements C9219c {

    /* renamed from: a */
    final /* synthetic */ C9227g f12477a;

    /* renamed from: b */
    final /* synthetic */ C3908m f12478b;

    C3905l(C3908m mVar, C9227g gVar) {
        this.f12478b = mVar;
        this.f12477a = gVar;
    }

    public final void onComplete(Task task) {
        this.f12478b.f12483b.remove(this.f12477a);
    }
}
