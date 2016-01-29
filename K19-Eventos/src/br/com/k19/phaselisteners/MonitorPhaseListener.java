package br.com.k19.phaselisteners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MonitorPhaseListener implements PhaseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long a, b;

	@Override
	public void afterPhase(PhaseEvent event) {

		System.out.println("MonitorPhaseListener.afterPhase() -" + event.getPhaseId());
		a = System.currentTimeMillis();
		System.out.println(a - b);
	}

	@Override
	public void beforePhase(PhaseEvent event) {

		System.out.println("MonitorPhaseListener.beforePhase() -" + event.getPhaseId());
		b = System.currentTimeMillis();
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;

	}

}
