package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.zzd;

final class zzc implements zzd {
    zzc() {
    }

    public final zzi zza(Context context, String str, zzh com_google_android_gms_dynamite_zzh) throws com.google.android.gms.dynamite.DynamiteModule.zzc {
        zzi com_google_android_gms_dynamite_zzi = new zzi();
        com_google_android_gms_dynamite_zzi.zzaSU = com_google_android_gms_dynamite_zzh.zzE(context, str);
        if (com_google_android_gms_dynamite_zzi.zzaSU != 0) {
            com_google_android_gms_dynamite_zzi.zzaSW = -1;
        } else {
            com_google_android_gms_dynamite_zzi.zzaSV = com_google_android_gms_dynamite_zzh.zzb(context, str, true);
            if (com_google_android_gms_dynamite_zzi.zzaSV != 0) {
                com_google_android_gms_dynamite_zzi.zzaSW = 1;
            }
        }
        return com_google_android_gms_dynamite_zzi;
    }
}
