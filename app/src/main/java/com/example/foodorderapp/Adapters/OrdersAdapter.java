package com.example.foodorderapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.foodorderapp.Models.OrdersModel;
import com.example.foodorderapp.R;

import java.util.ArrayList;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.viewholder> {

    ArrayList<OrdersModel> list;
    Context context;

    public OrdersAdapter(ArrayList<OrdersModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.order_sample, parent , false);
        return new viewholder(view);
    };

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        final OrdersModel model= list.get(position);
        holder.orderImage.setImageResource(model.getOrdreImage());
        holder.soldItemName.setText(model.getSoldItemnName());
        holder.orderNumber.setText(model.getOrderNumber());
        holder.price.setText(model.getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
    ImageView orderImage;
    TextView soldItemName , orderNumber , price;

    public viewholder(@NonNull View itemView) {
        super(itemView);
        orderImage = itemView.findViewById(R.id.orderImage);
        soldItemName = itemView.findViewById(R.id.orderItemName);
        orderNumber = itemView.findViewById(R.id.orderNumber);
        price = itemView.findViewById(R.id.orderPrice);
    }
}
}