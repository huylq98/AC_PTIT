package es.ucm.fdi.ac.expression;

import java.util.ArrayList;

public abstract class ExpressionPanel {

	protected boolean selected;
	protected CompositeExpressionPanel parentPanel;
	protected ArrayList<ExpressionListener> el;

	public ExpressionPanel(CompositeExpressionPanel parentPanel) {
		this.el = new ArrayList<ExpressionListener>();
		this.parentPanel = parentPanel;

		if (parentPanel != null) {
			CompositeExpressionPanel p = parentPanel;
			while (p != null) {
				p = p.parentPanel;
			}
		}
	}

	public void addExpressionListener(ExpressionListener l) {
		el.add(l);
	}

	public void removeExpressionListener(ExpressionListener l) {
		el.remove(l);
	}

	private ArrayList<ExpressionListener> getExpressionListeners() {
		ArrayList<ExpressionListener> list = el;
		ExpressionPanel ep = this;
		while (ep.el.isEmpty() && ep.parentPanel != null) {
			ep = ep.parentPanel;
		}
		list = ep.el;
		return list;
	}

	public void test(boolean wasTest) {
		for (ExpressionListener l : getExpressionListeners()) {
			l.expressionChanged(getExpression(), wasTest);
		}
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public abstract void setExpression(Expression e);

	public abstract Expression getExpression();
}
