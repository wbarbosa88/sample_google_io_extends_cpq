package ciandt.com.iosample.model;

import android.content.Context;
import android.graphics.drawable.Drawable;

import ciandt.com.iosample.R;

/**
 * Created by Monan on 5/24/15.
 */
public class Medical {

    private static final int MEDICAL_TYPE_DEFAULT = 0;
    private static final int MEDICAL_TYPE_SYRUP = 1;
    private static final int MEDICAL_TYPE_PILL = 2;
    private static final int MEDICAL_TYPE_INJECTION = 3;

    public int typeMedical;
    public String name;
    public long alarmTimestamp;

    public Drawable getDrawableTypeMedical(Context context){
        Drawable result = null;
        switch(typeMedical){
            case MEDICAL_TYPE_SYRUP:
                result = context.getResources().getDrawable(R.drawable.syrop);
                break;
            case MEDICAL_TYPE_PILL:
                result = context.getResources().getDrawable(R.drawable.pills);
                break;
            case MEDICAL_TYPE_INJECTION:
                result = context.getResources().getDrawable(R.drawable.injection);
                break;
            default:
                result = context.getResources().getDrawable(R.drawable.notepad);
                
        }
        return result;
    }
    
    public String getAlarmTimestampFormated(Context context){
        return null;
    }
    
}
