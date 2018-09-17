if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'KtCore'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'KtCore'.");
}
var KtCore = function (_, Kotlin) {
  'use strict';
  var Kind_INTERFACE = Kotlin.Kind.INTERFACE;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var Kind_OBJECT = Kotlin.Kind.OBJECT;
  var support_version;
  function Coords() {
  }
  function Coords$Relative() {
  }
  Coords$Relative.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Relative',
    interfaces: []
  };
  function Coords$Vec() {
  }
  Coords$Vec.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Vec',
    interfaces: []
  };
  Coords.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Coords',
    interfaces: []
  };
  function SimpleCoords() {
  }
  Object.defineProperty(SimpleCoords.prototype, 'relative', {
    get: function () {
      return null;
    }
  });
  Object.defineProperty(SimpleCoords.prototype, 'vec', {
    get: function () {
      return null;
    }
  });
  SimpleCoords.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'SimpleCoords',
    interfaces: [Coords]
  };
  function mutableCoordsOf$ObjectLiteral(closure$x, closure$y, closure$z) {
    this.x_n5qta3$_0 = closure$x;
    this.y_n5qt98$_0 = closure$y;
    this.z_n5qt8d$_0 = closure$z;
  }
  Object.defineProperty(mutableCoordsOf$ObjectLiteral.prototype, 'x', {
    get: function () {
      return this.x_n5qta3$_0;
    },
    set: function (x) {
      this.x_n5qta3$_0 = x;
    }
  });
  Object.defineProperty(mutableCoordsOf$ObjectLiteral.prototype, 'y', {
    get: function () {
      return this.y_n5qt98$_0;
    },
    set: function (y) {
      this.y_n5qt98$_0 = y;
    }
  });
  Object.defineProperty(mutableCoordsOf$ObjectLiteral.prototype, 'z', {
    get: function () {
      return this.z_n5qt8d$_0;
    },
    set: function (z) {
      this.z_n5qt8d$_0 = z;
    }
  });
  mutableCoordsOf$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: [SimpleCoords]
  };
  function mutableCoordsOf(x, y, z) {
    return new mutableCoordsOf$ObjectLiteral(x, y, z);
  }
  function coordsOf$ObjectLiteral(closure$x, closure$y, closure$z) {
    this.x_ahg4l9$_0 = closure$x;
    this.y_ahg4m4$_0 = closure$y;
    this.z_ahg4mz$_0 = closure$z;
  }
  Object.defineProperty(coordsOf$ObjectLiteral.prototype, 'x', {
    get: function () {
      return this.x_ahg4l9$_0;
    }
  });
  Object.defineProperty(coordsOf$ObjectLiteral.prototype, 'y', {
    get: function () {
      return this.y_ahg4m4$_0;
    }
  });
  Object.defineProperty(coordsOf$ObjectLiteral.prototype, 'z', {
    get: function () {
      return this.z_ahg4mz$_0;
    }
  });
  coordsOf$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: [SimpleCoords]
  };
  function coordsOf(x, y, z) {
    return new coordsOf$ObjectLiteral(x, y, z);
  }
  function Entitys() {
    Entitys$Companion_getInstance();
  }
  function Entitys$Companion() {
    Entitys$Companion_instance = this;
  }
  Entitys$Companion.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Companion',
    interfaces: []
  };
  var Entitys$Companion_instance = null;
  function Entitys$Companion_getInstance() {
    if (Entitys$Companion_instance === null) {
      new Entitys$Companion();
    }
    return Entitys$Companion_instance;
  }
  Entitys.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Entitys',
    interfaces: []
  };
  function Items() {
  }
  Items.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Items',
    interfaces: []
  };
  function Players() {
    Players$Companion_getInstance();
  }
  function Players$Companion() {
    Players$Companion_instance = this;
  }
  Players$Companion.prototype.getHealth = function () {
    return Entity.getHealth(Player.get());
  };
  Players$Companion.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Companion',
    interfaces: []
  };
  var Players$Companion_instance = null;
  function Players$Companion_getInstance() {
    if (Players$Companion_instance === null) {
      new Players$Companion();
    }
    return Players$Companion_instance;
  }
  Players.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Players',
    interfaces: []
  };
  var package$com = _.com || (_.com = {});
  var package$sorrowblue = package$com.sorrowblue || (package$com.sorrowblue = {});
  var package$ktcore = package$sorrowblue.ktcore || (package$sorrowblue.ktcore = {});
  Object.defineProperty(package$ktcore, 'support_version', {
    get: function () {
      return support_version;
    }
  });
  Coords.Relative = Coords$Relative;
  Coords.Vec = Coords$Vec;
  var package$peripheral = package$ktcore.peripheral || (package$ktcore.peripheral = {});
  package$peripheral.Coords = Coords;
  package$peripheral.SimpleCoords = SimpleCoords;
  package$peripheral.mutableCoordsOf_qt1dr2$ = mutableCoordsOf;
  package$peripheral.coordsOf_qt1dr2$ = coordsOf;
  Object.defineProperty(Entitys, 'Companion', {
    get: Entitys$Companion_getInstance
  });
  package$peripheral.Entitys = Entitys;
  package$peripheral.Items = Items;
  Object.defineProperty(Players, 'Companion', {
    get: Players$Companion_getInstance
  });
  package$peripheral.Players = Players;
  Object.defineProperty(mutableCoordsOf$ObjectLiteral.prototype, 'relative', Object.getOwnPropertyDescriptor(SimpleCoords.prototype, 'relative'));
  Object.defineProperty(mutableCoordsOf$ObjectLiteral.prototype, 'vec', Object.getOwnPropertyDescriptor(SimpleCoords.prototype, 'vec'));
  Object.defineProperty(coordsOf$ObjectLiteral.prototype, 'relative', Object.getOwnPropertyDescriptor(SimpleCoords.prototype, 'relative'));
  Object.defineProperty(coordsOf$ObjectLiteral.prototype, 'vec', Object.getOwnPropertyDescriptor(SimpleCoords.prototype, 'vec'));
  support_version = '1.1.2.42 beta';
  Kotlin.defineModule('KtCore', _);
  return _;
}(typeof KtCore === 'undefined' ? {} : KtCore, kotlin);

//# sourceMappingURL=KtCore.js.map
