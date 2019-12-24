<html>
<body>
	<form action="./register" method="post">
		<fieldset>
			<legend>Employee Details</legend>
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
		</fieldset>
		<fieldset>
			<legend>Employee personal address</legend>
			<table>
				<tr>
					<td>AddressType:</td>
					<td><select name="addressBeans[0].addresstype">
							<option>.......Select..............</option>
							<option value="permanent address">permanent address</option>
							<option value="current address">current address</option>
					</select></td>
				</tr>
				<tr>
					<td>Address1:</td>
					<td><input type="text" name="addressBeans[0].address1"></td>
				</tr>
				<tr>
					<td>Address2:</td>
					<td><input type="text" name="addressBeans[0].address2"></td>
				</tr>
			</table>
		</fieldset>
		<fieldset>
			<legend>Employee Training details</legend>
			<table>
				<tr>
					<td>AddressType:</td>
					<td><select name="addressBeans[1].addresstype">
					<option>............Select.........</option>
							<option value="permanent address">permanent address</option>
							<option value="current address">current address</option>
					</select></td>
				</tr>
				<tr>
					<td>Address1:</td>
					<td><input type="text" name="addressBeans[1].address1"></td>
				</tr>
				<tr>
					<td>Address2:</td>
					<td><input type="text" name="addressBeans[1].address2"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register" ></td>
					<td><input type="reset" value="Reset"></td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>