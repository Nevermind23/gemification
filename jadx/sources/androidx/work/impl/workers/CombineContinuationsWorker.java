package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.C2068l;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.C41536l;

public final class CombineContinuationsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(workerParameters, "workerParams");
    }

    public C2068l.C2069a doWork() {
        C2068l.C2069a d = C2068l.C2069a.m8068d(getInputData());
        C41536l.m120488h(d, "success(inputData)");
        return d;
    }
}
