package ciandt.com.iosample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import ciandt.com.iosample.R;
import ciandt.com.iosample.model.Medical;

/**
 * Created by Monan on 5/24/15.
 */
public class MedicalAdapter extends RecyclerView.Adapter<MedicalAdapter.ViewHolder>{

    private Context mContext;
    private ArrayList<Medical> mMedicalList;

    public MedicalAdapter(Context context, ArrayList<Medical> medicalList){
        this.mContext = context;
        this.mMedicalList = medicalList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.medical_card_list_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.txtName.setText(mMedicalList.get(position).name);
        viewHolder.imgMedice.setImageDrawable(mMedicalList.get(position).getDrawableTypeMedical(mContext));
    }

    @Override
    public int getItemCount() {
        return mMedicalList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgMedice;
        public TextView txtName;
        public TextView txtHourAlarm;

        public ViewHolder(View v){
            super(v);
            imgMedice = (ImageView) v.findViewById(R.id.img_type_medication);
            txtName = (TextView) v.findViewById(R.id.name);
            txtHourAlarm = (TextView) v.findViewById(R.id.alarm);
        }
    }



}
