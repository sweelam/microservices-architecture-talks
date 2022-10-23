submitOrder(Ordeer order) {

	saveOrder(order);
	
	if (checkDuplicates(order)) {

			charge(order);
		
			sendEmail(order);
		
			auditOrderDetails(order);

	}
}

charge(Order order) {
	// call Charging service
}

sendEmail(Order order) {
	// call Notification service
}