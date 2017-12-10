package nyc.c4q.jsoninclassjose;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MessageViewHolder extends RecyclerView.ViewHolder {

    private TextView messageTextView;

    public MessageViewHolder(View itemView) {
        super(itemView);

        messageTextView = (TextView) itemView.findViewById(R.id.message_textview);
    }

    public void onBind(String message) {

        messageTextView.setText(message);
    }
}
