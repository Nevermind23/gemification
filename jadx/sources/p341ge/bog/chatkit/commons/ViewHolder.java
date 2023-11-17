package p341ge.bog.chatkit.commons;

import android.view.View;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;

@Keep
/* renamed from: ge.bog.chatkit.commons.ViewHolder */
public abstract class ViewHolder<DATA> extends RecyclerView.C1734f0 {
    public ViewHolder(View view) {
        super(view);
    }

    public abstract void onBind(DATA data);
}
