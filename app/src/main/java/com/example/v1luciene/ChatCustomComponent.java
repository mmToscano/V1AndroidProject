package com.example.v1luciene;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ChatCustomComponent extends ConstraintLayout {

    private ImageView chatImage;
    private TextView chatName;
    private ImageView chatStatusIcon;
    private TextView chatStatus;
    private ImageView bellImage;

    // Constructors
    public ChatCustomComponent(Context context) {
        super(context);

        init(context);
    }

    public ChatCustomComponent(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        init(context);
    }

    // Initialization method to inflate layout and find views
    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.chat_custom_component, this, true);

        // Get references to the views
        chatImage = findViewById(R.id.chatImage);
        chatName = findViewById(R.id.chatName);
        chatStatusIcon = findViewById(R.id.chatStatusIcon);
        chatStatus = findViewById(R.id.chatStatus);
        bellImage = findViewById(R.id.bellImage);
    }

    public void setChatName(String text){
        chatName.setText(text);
    }


}
