package p503lg;

import android.view.View;
import p341ge.bog.chat.domain.model.components.PreContractComponent;
import p341ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder;

/* renamed from: lg.h */
public final /* synthetic */ class C16568h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomIncomingMessageViewHolder f46731d;

    /* renamed from: e */
    public final /* synthetic */ PreContractComponent f46732e;

    public /* synthetic */ C16568h(CustomIncomingMessageViewHolder customIncomingMessageViewHolder, PreContractComponent preContractComponent) {
        this.f46731d = customIncomingMessageViewHolder;
        this.f46732e = preContractComponent;
    }

    public final void onClick(View view) {
        CustomIncomingMessageViewHolder.m49314z(this.f46731d, this.f46732e, view);
    }
}
