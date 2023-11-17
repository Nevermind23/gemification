package p503lg;

import android.view.View;
import p341ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder;

/* renamed from: lg.i */
public final /* synthetic */ class C16569i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f46733d;

    /* renamed from: e */
    public final /* synthetic */ CustomIncomingMessageViewHolder f46734e;

    public /* synthetic */ C16569i(View view, CustomIncomingMessageViewHolder customIncomingMessageViewHolder) {
        this.f46733d = view;
        this.f46734e = customIncomingMessageViewHolder;
    }

    public final void run() {
        CustomIncomingMessageViewHolder.C13083d.m49327b(this.f46733d, this.f46734e);
    }
}
