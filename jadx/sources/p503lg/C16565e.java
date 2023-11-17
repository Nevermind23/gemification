package p503lg;

import android.view.View;
import p341ge.bog.chat.domain.model.components.FAQComponent;
import p341ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder;

/* renamed from: lg.e */
public final /* synthetic */ class C16565e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomIncomingMessageViewHolder f46723d;

    /* renamed from: e */
    public final /* synthetic */ FAQComponent f46724e;

    public /* synthetic */ C16565e(CustomIncomingMessageViewHolder customIncomingMessageViewHolder, FAQComponent fAQComponent) {
        this.f46723d = customIncomingMessageViewHolder;
        this.f46724e = fAQComponent;
    }

    public final void onClick(View view) {
        CustomIncomingMessageViewHolder.m49311w(this.f46723d, this.f46724e, view);
    }
}
