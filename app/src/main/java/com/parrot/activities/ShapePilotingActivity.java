package com.parrot.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;

import com.parrot.arsdk.arcontroller.ARCONTROLLER_DEVICE_STATE_ENUM;
import com.parrot.arsdk.arcontroller.ARCONTROLLER_DICTIONARY_KEY_ENUM;
import com.parrot.arsdk.arcontroller.ARCONTROLLER_ERROR_ENUM;
import com.parrot.arsdk.arcontroller.ARControllerDictionary;
import com.parrot.arsdk.arcontroller.ARDeviceController;
import com.parrot.arsdk.arcontroller.ARDeviceControllerListener;
import com.parrot.arsdk.arcontroller.ARDeviceControllerStreamListener;
import com.parrot.arsdk.arcontroller.ARFrame;
import com.parrot.arsdk.ardiscovery.ARDiscoveryDeviceService;
import com.parrot.bebopdronepiloting.R;

/**
 * Created by gnasr on 10/8/2015.
 */
public class  ShapePilotingActivity extends Activity implements ARDeviceControllerListener, ARDeviceControllerStreamListener, SurfaceHolder.Callback {

    private Button backBt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape_piloting);


        //##Go to menu for managing shapes stuffff
        backBt=(Button) findViewById(R.id.back);
        backBt.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                ARDiscoveryDeviceService service = MainActivity.deviceList.get(0);

                Intent intent = new Intent(ShapePilotingActivity.this, PilotingActivity.class);
                intent.putExtra(PilotingActivity.EXTRA_DEVICE_SERVICE, service);


                startActivity(intent);
                return true;
            }
        });
    }

    @Override
    public void onStateChanged(ARDeviceController arDeviceController, ARCONTROLLER_DEVICE_STATE_ENUM arcontroller_device_state_enum, ARCONTROLLER_ERROR_ENUM arcontroller_error_enum) {

    }

    @Override
    public void onCommandReceived(ARDeviceController arDeviceController, ARCONTROLLER_DICTIONARY_KEY_ENUM arcontroller_dictionary_key_enum, ARControllerDictionary arControllerDictionary) {

    }

    @Override
    public void onFrameReceived(ARDeviceController arDeviceController, ARFrame arFrame) {

    }

    @Override
    public void onFrameTimeout(ARDeviceController arDeviceController) {

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}
