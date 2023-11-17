package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.measurement.v0 */
public abstract class C4444v0 {

    /* renamed from: a */
    private static final Method f13755a;

    /* renamed from: b */
    private static final Method f13756b;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 6
            java.lang.String r4 = "JobSchedulerCompat"
            r5 = 0
            r6 = 24
            if (r1 < r6) goto L_0x0033
            java.lang.Class<android.app.job.JobScheduler> r1 = android.app.job.JobScheduler.class
            java.lang.String r7 = "scheduleAsPackage"
            r8 = 4
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.Class<android.app.job.JobInfo> r9 = android.app.job.JobInfo.class
            r8[r2] = r9     // Catch:{ NoSuchMethodException -> 0x0028 }
            r9 = 1
            r8[r9] = r0     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0028 }
            r10 = 2
            r8[r10] = r9     // Catch:{ NoSuchMethodException -> 0x0028 }
            r9 = 3
            r8[r9] = r0     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r7, r8)     // Catch:{ NoSuchMethodException -> 0x0028 }
            goto L_0x0034
        L_0x0028:
            boolean r0 = android.util.Log.isLoggable(r4, r3)
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "No scheduleAsPackage method available, falling back to schedule"
            android.util.Log.e(r4, r0)
        L_0x0033:
            r0 = r5
        L_0x0034:
            f13755a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r6) goto L_0x0050
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r1 = "myUserId"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0045 }
            java.lang.reflect.Method r5 = r0.getDeclaredMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0045 }
            goto L_0x0050
        L_0x0045:
            boolean r0 = android.util.Log.isLoggable(r4, r3)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = "No myUserId method available"
            android.util.Log.e(r4, r0)
        L_0x0050:
            f13756b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4444v0.<clinit>():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m17030a(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r5.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            r7.getClass()
            java.lang.reflect.Method r8 = f13755a
            if (r8 == 0) goto L_0x0074
            java.lang.String r8 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = r5.checkSelfPermission(r8)
            if (r5 == 0) goto L_0x0018
            goto L_0x0074
        L_0x0018:
            java.lang.reflect.Method r5 = f13756b
            r8 = 0
            if (r5 == 0) goto L_0x003f
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ IllegalAccessException -> 0x0030, InvocationTargetException -> 0x002e }
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch:{ IllegalAccessException -> 0x0030, InvocationTargetException -> 0x002e }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException -> 0x0030, InvocationTargetException -> 0x002e }
            if (r5 == 0) goto L_0x003f
            int r5 = r5.intValue()     // Catch:{ IllegalAccessException -> 0x0030, InvocationTargetException -> 0x002e }
            goto L_0x0040
        L_0x002e:
            r5 = move-exception
            goto L_0x0031
        L_0x0030:
            r5 = move-exception
        L_0x0031:
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "myUserId invocation illegal"
            android.util.Log.e(r1, r0, r5)
        L_0x003f:
            r5 = r8
        L_0x0040:
            java.lang.String r0 = "UploadAlarm"
            java.lang.String r1 = "com.google.android.gms"
            java.lang.reflect.Method r2 = f13755a
            if (r2 == 0) goto L_0x006f
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0067 }
            r3[r8] = r6     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0067 }
            r4 = 1
            r3[r4] = r1     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0067 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0067 }
            r1 = 2
            r3[r1] = r5     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0067 }
            r5 = 3
            r3[r5] = r0     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0067 }
            java.lang.Object r5 = r2.invoke(r7, r3)     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0067 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0067 }
            if (r5 == 0) goto L_0x0073
            int r8 = r5.intValue()     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0067 }
            goto L_0x0073
        L_0x0067:
            r5 = move-exception
            goto L_0x006a
        L_0x0069:
            r5 = move-exception
        L_0x006a:
            java.lang.String r8 = "error calling scheduleAsPackage"
            android.util.Log.e(r0, r8, r5)
        L_0x006f:
            int r8 = r7.schedule(r6)
        L_0x0073:
            return r8
        L_0x0074:
            int r5 = r7.schedule(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4444v0.m17030a(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
