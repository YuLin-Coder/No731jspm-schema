function getRoleButtons() {
	var role = window.sessionStorage.getItem('role');
	var allButtons = ["新增", "修改", "查看", "删除", "审核", "回复", "发货", "报表", "支付"];
	for (var i = 0; i < menus.length; i++) {
		// 找到当前登录角色的菜单
		if (menus[i].roleName == role) {
			//console.log("your role is : " + role);
			var menu = menus[i].backMenu;
			for (var j = 0; j < menu.length; j++) {
				// 一级菜单
				var menuChild = menu[j].child;
				var secondMenuName = "";
				for (var k = 0; k < menuChild.length; k++) {
					// 二级菜单
					if (tableName == menuChild[k].tableName && k == 0) {

						var buttons = menuChild[k].buttons;
						//console.log("The buttons that you can see: " + buttons);
						for (var l = 0; l < allButtons.length; l++) {
							//console.log("check if you can see " + allButtons[l]);
							var flag = false;
							for (var m = 0; m < buttons.length; m++) {
								// 如果角色按钮存在，则不用删除
								if (allButtons[l] == buttons[m]) {
									flag = true;
									//console.log("you can see " + buttons[m]);
								}
							}
							if (flag == false) {
								//console.log("you can't see " + allButtons[l]);
								var elements = document.getElementsByClassName(allButtons[l]);
								for (var n = elements.length - 1; n >= 0; n--) {
									elements[n].parentNode.removeChild(elements[n]);
								}
							}
						}
					}

				}
			}
		}
	}
}