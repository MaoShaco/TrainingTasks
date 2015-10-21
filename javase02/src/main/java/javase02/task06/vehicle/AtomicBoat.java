package javase02.task06.vehicle;

import javase02.task07.vehicle.annotation.AtomicBoatSummary;
import javase02.task07.vehicle.annotation.EngineState;

import java.lang.reflect.Method;

/**
 * Created by Mao Shaco on 10/21/2015.
 */
@AtomicBoatSummary(type = "Ballistic missile submarine", speed = 42)
public class AtomicBoat implements Vehicle {

    private AtomicBoatEngine boatEngine;
    private boolean moving;

    public AtomicBoat() {
        this.boatEngine = new AtomicBoatEngine();
    }

    public String getState() {
        this.StartMove();
        return "Boat is" + (moving ? " ":" not ")+ "moving";
    }

    private void StartMove() {
        try {
            if (isEngineWorkable())
                this.boatEngine.Run();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private boolean isEngineWorkable() throws NoSuchMethodException {
        Method method = this.boatEngine.getClass().getMethod("Run");
        EngineState vehicleState = method.getAnnotation(EngineState.class);
        //return vehicleState != null ? vehicleState.workable() : false;
        return vehicleState != null && vehicleState.workable();

    }

    private class AtomicBoatEngine {

        @EngineState(workable = true)
        public void Run() {
            moving = true;
        }
    }
}
